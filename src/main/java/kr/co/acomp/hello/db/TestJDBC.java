package kr.co.acomp.hello.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/spring"
				+ "?serverTimezone=Asia/Seoul&useSSL=true";
		  String user= "spring";
		  String pass= "spring";
		 

		 
		  Connection conn = null;
		 
		  try
		  {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   System.out.println("����̹� �˻� ����");
		   conn =DriverManager.getConnection(url, user, pass);
		   System.out.println("���Ӽ���"+conn);
		  
		  }
		  catch(ClassNotFoundException e)
		  {
		   System.out.println("����̹� �˻� ����");
		   e.printStackTrace();
		  }
		  catch(SQLException e)
		  {
		   e.printStackTrace();
		  }
	}

}
