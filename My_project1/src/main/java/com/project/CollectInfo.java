package com.project;

import java.sql.SQLException;

public class CollectInfo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	InsertData.register();
	}

}
