package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertData {
static int rollNum;
 static String name;
 static String cls;
 static String gender;
  static String blood;
 InsertData(int rollNum,String name,String cls,String gender,String blood)
 {
	 this.rollNum=rollNum;
	 this.name=name;
	 this.cls=cls;
	 this.gender=gender;
	 this.blood=blood;
 }
public static void register( ) throws SQLException
{
	
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
	PreparedStatement ps=con.prepareStatement("insert into Students value(?,?,?,?,?)");
	ps.setInt(1, rollNum);
	ps.setString(2, name);
	ps.setString(3, cls);
	ps.setString(4, gender);
	ps.setString(5, blood);
	int i=ps.executeUpdate();
	if(i>0)System.out.println("Registration complete!");
	else System.out.println("Somthing went Wrong.");
}
}
