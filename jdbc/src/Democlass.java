import java.io.ObjectInputStream.GetField;
import java.sql.*;


//java database connectivity  by telusko

/*
* 1.import--> java.sql
2. load and register--> com.mysql.jdbc.Driver
3.create connection--> connection
4.create statement-->statement
5.execute the query
6.results
7.close
*/

public class Democlass {

	public static void main(String[] args) throws ClassNotFoundException
	{
		String url="";
		String uname="root";
		String pw="";
		Class.forName("com.mysql.jdbc.Driver"); //class forname telusko
		Connection con =DriverManager.getConnection(url,uname,pw);

	}

}
