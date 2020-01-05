package com.silkroad.SilkRoadDB;

import java.sql.Connection;
import java.sql.DriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBConnection {
	private Logger logger = LoggerFactory.getLogger(DBConnection.class);

	public static Connection getDBConnector() {
		Connection conn = null;

		if (conn == null) {
			try {
				String user = "root";
				String password = "sevenn0801";
				String url = "jdbc:mysql://localhost:3306/spring?serverTimezone=UTC&useSSL=false&autoReconnect=true&useUnicode=true&characterEncoding=utf8";

				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				System.err.println("연결실패!");
			}
		}
		return conn;
	}// end of getConnection()

	public static void main(String[] args) {
		System.out.println(getDBConnector());
	}
}