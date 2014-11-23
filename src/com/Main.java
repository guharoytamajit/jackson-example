package com;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
	public static void main(String[] args) throws JsonGenerationException,
			JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		// this will not print property with value null
		mapper.setSerializationInclusion(Include.NON_NULL);
		// it will prevent unmarshalling from failing in case of an invalid
		// input
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);
		// pretty print
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		// it will expect the property name of houseNumber as house_number in
		// input and it will produce output of house_number for houseNumber
		// property
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);

		Employee employee = mapper.readValue(new File("input.json"),
				Employee.class);

		mapper.writeValue(System.out, employee);

	}
}
