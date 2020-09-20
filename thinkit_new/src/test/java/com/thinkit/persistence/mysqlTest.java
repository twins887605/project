package com.thinkit.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class mysqlTest {

	 private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	 private static final String URL = "jdbc:mysql://127.0.0.1:3306/thinkit?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false"; // jdbc:mysql://127.0.0.1:3306/여러분이 만드신 스키마이름
	 private static final String USER = "root"; //DB 사용자명
	 private static final String PW = "thinkit";   //DB 사용자 비밀번호
	 
	 @Test
	 public void testConnection() throws Exception{
	  Class.forName(DRIVER);
	  
	  try(Connection con = DriverManager.getConnection(URL, USER, PW)){
	   System.out.println("성공");
	   System.out.println(con);
	  }catch (Exception e) {
	   System.out.println("에러발생");
	   e.printStackTrace();
	  }
	 }

	}

