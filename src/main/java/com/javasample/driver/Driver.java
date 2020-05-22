package com.javasample.driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.javasample.domain.Employee;
import com.javasample.util.FileUtil;

public class Driver {
	public static void main(String[] args) throws IOException {
		System.out.println("Please Enter Your Name :");
		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
		String name = reader.readLine();
		String details[] = name.split(" ");
		String firstname = details[0];
		String lastname = details[1];
		String bloodGroup = details[2];
		Integer empId = Integer.parseInt(details[3]);
		
		Employee emp = new Employee(firstname, lastname, bloodGroup, empId);
		
		System.out.println("Employee Details are: "+ emp);										
		
		FileUtil.saveFileInJson(emp);
	}

}
