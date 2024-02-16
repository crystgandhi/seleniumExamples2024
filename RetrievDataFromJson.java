package com.seleniumExamples2024;

import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class RetrievDataFromJson {

	public static void main(String[] args) {
		
		try {
            // Specify the path to your JSON file
            String jsonFilePath = ".//Userdata.json";

            // Create a FileReader to read the JSON file
            Reader reader = new FileReader(jsonFilePath);

            // Use Gson to parse the JSON content
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);

            // Retrieve data from the JsonObject
            String username = jsonObject.get("username").getAsString();
            String password = jsonObject.get("password").getAsString();
            String url = jsonObject.get("url").getAsString();

            // Print the retrieved data
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("URL: " + url);

            // Close the reader
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
