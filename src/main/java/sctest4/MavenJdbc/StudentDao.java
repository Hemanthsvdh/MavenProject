package sctest4.MavenJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	
	public void saveStudent(Student std) {
		String s="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/savefile";
		String user_name="root";
		String password="root";
		String query="Insert into student values(?,?,?)";
		try {
			//1.Load and Register Driver
			Class.forName(s);
			//2.Establish connection
			Connection connection= DriverManager.getConnection(url,user_name,password);
			//3.CREATE Statement
			Statement st= connection.createStatement();
			//4.Execute statement
			PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setInt(1, std.getId());
		preparedStatement.setString(2, std.getName());
		preparedStatement.setDouble(3, std.getPhone());
			  
			
			preparedStatement.execute();
			
			//5.close
			connection.close();
System.out.println("data saved");
				
		}

		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
