package com.tutorialsninja.qa.testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbTest {
	public static void main(String args[]) throws SQLException {
		
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("Driver lodaed");
		//AS-PF1ACRZ2-L
		String conURL = "jdbc:sqlserver://AS-PF1ACRZ2-L\\MSSQLSERVER:1433;databaseName=Practice;user=fssfss;password=fssuser;trustServerCertificate=true";
		System.out.println(conURL);
		//String conURL = "jdbc:sqlserver://DB-SQL-03\\MSSQLSERVER_2016:135;user=fssuser;password=fssuser;databaseName=at_vinay_test;IntegratedSecurity=true";
		Connection con1 = DriverManager.getConnection(conURL);
		System.out.println("SQL connected");
		Statement smt = con1.createStatement();
		ResultSet rs = smt.executeQuery("select * from FXTRANS");
		int i=0;
		while(rs.next())
		{
			String firstName = rs.getString("COU_PAR");
			System.out.println("Entry No " + (i+1) +" is:"+ firstName);
			i++;
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
