package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
public static void register() throws SQLException
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Roll number");
	int rollNum= sc.nextInt();
	
	System.out.println("Enter Name");
	String Name= sc.next();
	
	System.out.println("Enter Class  ");
	String cls= sc.next();
	
	System.out.println("Enter gender");
	String Gender= sc.next();
	

	System.out.println("Enter Blood group");
	String blood= sc.next();
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
	PreparedStatement ps=con.prepareStatement("insert into Students value(?,?,?,?,?)");
	ps.setInt(1, rollNum);
	ps.setString(2, Name);
	ps.setString(3, cls);
	ps.setString(4, Gender);
	ps.setString(5, blood);
	int i=ps.executeUpdate();
	if(i>0)System.out.println("Registration complete!");
	else System.out.println("Somthing went Wrong.");
}
}
