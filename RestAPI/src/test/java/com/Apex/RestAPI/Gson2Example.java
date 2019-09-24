package com.Apex.RestAPI;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Gson2Example {
	public static void main(String[] args) {

		Gson gson = new Gson();

		try (Reader reader = new FileReader(
				"C:\\Users\\Anu\\Ecommercenew\\RestAPI\\src\\main\\java\\com\\Apex\\RestAPI\\Staff.json")) 
		{

			// Convert JSON to Java Object
			Staff staff = gson.fromJson(reader, Staff.class);
			System.out.println(staff);

			// Convert JSON to JsonElement, and later to String
			JsonElement json = gson.fromJson(reader, JsonElement.class);
			String jsonInString = gson.toJson(json);
			System.out.println(jsonInString);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	   }

