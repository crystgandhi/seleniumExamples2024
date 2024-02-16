package com.seleniumExamples2024;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDataFromJson2 {

	public static void main(String[] args) {

		try {
			// Specify the path to your JSON file
			String jsonFilePath = "Employees.json";

			// Read the JSON file as a string
			String jsonContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));

			// Parse the JSON content using Jackson
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode rootNode = objectMapper.readTree(jsonContent);

			// Retrieve the "employees" JSON array
			JsonNode employeesArray = rootNode.get("employees").get("employee");

			// Iterate over each employee object
			for (JsonNode employee : employeesArray) {
				String name = employee.get("name").asText();
				int age = employee.get("age").asInt();
				String city = employee.get("city").asText();
				boolean isStudent = employee.get("isStudent").asBoolean();
				JsonNode skillsArray = employee.get("skills");

				// Print employee information
				System.out.println("\nName: " + name);
				System.out.println("Age: " + age);
				System.out.println("City: " + city);
				System.out.println("Is Student: " + isStudent);
				System.out.print("Skills: ");
				for (JsonNode skill : skillsArray) {
					System.out.print(skill.asText());
					if (skill != skillsArray.get(skillsArray.size() - 1)) {
						System.out.print(", ");
					}
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
