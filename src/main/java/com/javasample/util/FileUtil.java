package com.javasample.util;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javasample.domain.Employee;

public class FileUtil {

	public static void saveFileInJson(Employee emp) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(emp);
			System.out.println("ResultingJSONstring = " + json);
			PrintWriter out1 = null;
			out1 = new PrintWriter(new FileWriter("file.json"));
			out1.write(json);
			out1.close();

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			System.out.println("error: " + ex.toString());
		}
	}

}
