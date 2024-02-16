package com.seleniumExamples2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasseExample {

	public static void main(String[] args) throws SQLException {
		Connection connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","Gandhi", "Utestgandhi@2020");
		Statement statement=connection.createStatement();
        int rowsAffected = statement.executeUpdate("INSERT INTO student VALUES('Fazil', 105)");
        ResultSet resultSet = statement.executeQuery("SELECT name FROM student ORDER BY name");

		ResultSet result=statement.executeQuery("Select * from student where id=102");

		while(result.next()) {
				System.out.println(result.getString("name"));
				System.out.println(result.getInt("id"));
				
			}

	}

}
