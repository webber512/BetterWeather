package com.alexwebber.weather.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.support.DomainClassConverter;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.MappedInterceptor;
import org.springframework.web.servlet.mvc.WebContentInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.alexwebber.weather.util.JsonUtil;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

@Configuration
@EnableWebMvc
@EnableSpringDataWebSupport
@ComponentScan("com.alexwebber.weather")
public class WebMVCConfig implements WebMvcConfigurer {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(mappingJackson2HttpMessageConverter());
	}

	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter props = new MappingJackson2HttpMessageConverter();

		/*
		 * Registering a hibernate module to the JsonUtil Object Mapper makes the Object
		 * Mapper Hibernate Aware
		 */
		JsonUtil.registerModule(new Hibernate5Module());

		// copy of JsonUtil's objectMapper instance
		props.setObjectMapper(JsonUtil.copyOfObjectMapper());
		return props;
	}

	@Bean
	public FormattingConversionServiceFactoryBean conversionService() {
		return new FormattingConversionServiceFactoryBean();
	}

	@Bean
	public DomainClassConverter<?> domainClassConverter() {
		return new DomainClassConverter<FormattingConversionService>(conversionService().getObject());
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/").setCachePeriod(31555926);

		registry.setOrder(Integer.MIN_VALUE);
		registry.addResourceHandler("/favicon.ico").addResourceLocations("/WEB-INF/views/favicon.ico")
				.setCachePeriod(0);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/DoNothing").setViewName("/views/default/donothing");
		registry.addViewController("/ping").setViewName("/views/default/donothing");
		registry.addViewController("/DoNothing.do").setViewName("/views/default/donothing");
		registry.addViewController("/403").setViewName("/views/default/403");
	}

	@Bean
	public MappedInterceptor mappedInterceptor() {
		String[] mapInclude = { "/**" };
		String[] mapExclude = { "/resources/**" };
		WebContentInterceptor interceptor = new WebContentInterceptor();
		interceptor.setCacheSeconds(0);
		return new MappedInterceptor(mapInclude, mapExclude, interceptor);
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer props = new TilesConfigurer();
		props.setDefinitions("/WEB-INF/views.xml", "/WEB-INF/views/page-views.xml", "/WEB-INF/views/**/views.xml");
		return props;
	}

	@Bean
	public TilesViewResolver tilesViewResolver() {
		TilesViewResolver props = new TilesViewResolver();
		props.setViewClass(TilesView.class);
		return props;
	}

	@Bean(name = "Views")
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
