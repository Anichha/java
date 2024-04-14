package com.project;

import java.sql.SQLException;
import java.util.Scanner;

public class CollectInfo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x) {
		case 1: {
			System.out.println("Enter Roll number");
			int rollNum = sc.nextInt();

			System.out.println("Enter Name");
			String name = sc.next();

			System.out.println("Enter Class  ");
			String cls = sc.next();

			System.out.println("Enter gender");
			String gender = sc.next();

			System.out.println("Enter Blood group");
			String blood = sc.next();
			InsertData in = new InsertData(rollNum, name, cls, gender, blood);
			InsertData.register();
		}
		
		case 2: 
		{

		}
		
		}

	}

}
