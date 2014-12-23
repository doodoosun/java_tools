package com.json;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

 
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JackSonTest {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		 ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
		 User user = mapper.readValue(new File("user.json"), User.class);
		 
		 System.out.println(user);
		 
		 
			//convert Object to json string
 
			//configure Object mapper for pretty print
		      mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			
			//writing to console, can write to any output stream such as file
			StringWriter stringEmp = new StringWriter();
			mapper.writeValue(stringEmp, user);
			System.out.println("user JSON is\n"+stringEmp);
		
		
	}

}
