package com.alexwebber.weather.util;

import org.apache.commons.text.StringEscapeUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	private static final ObjectMapper mapper = new ObjectMapper();

	// Prevent instantiating a new instance of JsonUtil
	private JsonUtil() {
	}

	public static ObjectMapper copyOfObjectMapper() {
		return mapper.copy();
	}

	public static <T> String toJson(final T o) throws JsonProcessingException {
		/*
		 * This used to pass in false to escape, however after looking at the majority
		 * of dev, we came to the consensus that the majority of uses always wanted to
		 * escape their JSON.
		 */
		return toJson(o, true);
	}

	public static <T> String toJson(final T o, final boolean escapeJson) throws JsonProcessingException {
		String retVal;

		try {
			retVal = mapper.writeValueAsString(o);
		} catch (final JsonProcessingException e) {
			throw e;
		}

		if (escapeJson) {
			retVal = StringEscapeUtils.escapeEcmaScript(retVal);
		}

		return retVal;
	}

	public static <T> T fromJson(final String s, final Class<T> clazz) throws Exception {
		try {
			return mapper.readValue(s, clazz);
		} catch (final Exception e) {
			throw e;
		}
	}

	public static void registerModule(final Module module) {
		mapper.registerModule(module);
	}

}