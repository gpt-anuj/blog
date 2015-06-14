package com.springblog.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class H2Check {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:/Users/Anuj/java/h2/database/sample", "sa", "");
		System.out.println("Connectin "+conn.toString());

	}

}
