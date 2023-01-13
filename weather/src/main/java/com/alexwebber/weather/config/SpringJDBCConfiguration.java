package com.alexwebber.weather.config;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.alexwebber.weather.dao", entityManagerFactoryRef = "entityManagerFactory",
        transactionManagerRef = "transactionManager")
@PropertySource(value = {
    "classpath:application.properties"
})
public class SpringJDBCConfiguration {

    @Autowired
    private Environment environment;
    
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    	
    /************* Start Spring JPA config details **************/
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
        lcemfb.setJpaVendorAdapter(getJpaVendorAdapter());
        lcemfb.setDataSource(dataSource());
        lcemfb.setPersistenceUnitName("myJpaPersistenceUnit");
        lcemfb.setPackagesToScan("com.alexwebber.weather");
        lcemfb.setJpaProperties(hibernateProperties());
        return lcemfb;
    }

    @Bean
    public JpaVendorAdapter getJpaVendorAdapter() {
        JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        return adapter;
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager txManager() {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager(
            getEntityManagerFactoryBean().getObject());
        return jpaTransactionManager;
    }

    /************* End Spring JPA config details **************/

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("spring.jpa.properties.hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("spring.jpa.properties.hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("spring.jpa.properties.hibernate.format_sql"));
        properties.put("hibernate.use_sql_comments", environment.getRequiredProperty("spring.jpa.properties.hibernate.use_sql_comments"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("spring.jpa.properties.hibernate.hbm2ddl.auto"));
        return properties;
    }

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        String dbDriver = "";
        String dbUrl = "";
        String dbUsername = "";
        String dbPassword = "";
                
        try {        	
            Properties appProperties = new Properties();
            appProperties.load(SpringJDBCConfiguration.class.getClassLoader().getResourceAsStream("application.properties"));

            dbDriver = appProperties.getProperty("spring.datasource.driver-class-name");
            dbUrl = appProperties.getProperty("spring.datasource.url");
            dbUsername = appProperties.getProperty("spring.datasource.username");
            dbPassword = appProperties.getProperty("spring.datasource.password");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dbDriver);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }
    
    /**
     * Method returns String[] of packages for spring to scan for Entity Classes. Defined package strings should only be for entity packages
     * that use this datasource(JDBC/UPDDATAWHSE)
     * 
     * @return String[]
     */
    protected String[] packagesToScan() {
        List<String> packages = Arrays.asList("com.alexwebber.weather");
        return packages.toArray(new String[packages.size()]);
    }

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
    
}
