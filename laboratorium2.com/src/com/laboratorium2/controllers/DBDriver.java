package com.laboratorium2.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBDriver {
	static String imie="DefaultTim";
	static String nazwisko="DefaultJank";
	static String stanowisko="DefaultInf";
	static String plec="Mezczyzna";
	static String email="Default@email.com";
	static String login="Default";
	static String haslo="Default";
	public void pushData() {
		try {
			Class.forName("com.laboratorium2.controllers.DBDriver");
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_lab?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT","user","ZAQ!2wsx");
			PreparedStatement prepStmt = myConn.prepareStatement("INSERT INTO user (imie,nazwisko,stanowisko,plec,email,login,haslo) VALUES (?,?,?,?,?,?,?)");
			prepStmt.setString(1, imie);
			prepStmt.setString(2, nazwisko);
			prepStmt.setString(3, stanowisko);
			prepStmt.setString(4, plec);
			prepStmt.setString(5, email);
			prepStmt.setString(6, login);
			prepStmt.setString(7, haslo);
			prepStmt.executeUpdate();
		}	catch (Exception exc) {
			exc.printStackTrace();
		}
	
	}
	public void getData(String imie, String nazwisko, String stanowisko, String plec, String email, String login, String haslo) {
		DBDriver.imie=imie;
		DBDriver.nazwisko=nazwisko;
		DBDriver.stanowisko=stanowisko;
		DBDriver.plec=plec;
		DBDriver.email=email;
		DBDriver.login=login;
		DBDriver.haslo=haslo;
	}
}
