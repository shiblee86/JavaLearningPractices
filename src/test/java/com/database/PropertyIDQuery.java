package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PropertyIDQuery {

	public int getPropertyIDs()
			throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
		String dbUrl = "jdbc:mysql://NYCUB22T:3306/db_mobops_api";

		// Database Username
		String username = "root";
		// DB Password
		String password = "";

		// Query to Execute
		String PropertyIDQuery = "select distinct property_id from db_mobops_api.property order by property_name asc;";

		// Load mysql jdbc driver
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			// handle the error
		}

		// Create Connection to DB
		Connection con = DriverManager.getConnection(dbUrl, username, password);

		// Create Statement Object
		Statement stmt = con.createStatement();

		// Execute the SQL Query. Store results in ResultSet
		ResultSet NameQuery = stmt.executeQuery(PropertyIDQuery);

		System.out.println(NameQuery);

		// While Loop to iterate through all data and print results

		int count = 0;
		while (NameQuery.next()) {
			//String propertyName = NameQuery.getString(1);
			//System.out.println(propertyName);
			count++;

		}

		con.close();
		return count;

	}
}
