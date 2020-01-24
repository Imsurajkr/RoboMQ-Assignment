package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.api.jdbc.Statement;
import com.mysql.cj.jdbc.PreparedStatement;

public class customer {
	
	public class ConnectToDb{
		Connection con;
		PreparedStatement pre;
		Statement stat;
		ResultSet res;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// Load The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Make a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","password");
		// System.out.println("Connected ....");
		
		int ch = 1;
		while(true) {
			System.out.println("1. To Add Customer \n 2.To Edit Details \n 3. Delete Details \n 4. To see all Details \n 5. Exit ");
			Scanner k = new Scanner(System.in);
			ch = k.nextInt();
			// Query 
			if(ch == 1) {
			String str = "insert into customer(id, firstName, lastName, address, emailId) values(?,?,?,?,?)";
			Scanner sc = new Scanner(System.in);
			//Data of Customer
			System.out.println("Enter User Id");
			String s1 = sc.nextLine();
				
			System.out.println("Enter FistName");
			String s2 = sc.nextLine();
			
			System.out.println("Enter LastName");
			String s3 = sc.nextLine();
			
			System.out.println("Enter Address");
			String s4 = sc.nextLine();
			
			System.out.println("Enter Email Id");
			String s5 = sc.nextLine();
			
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(str);
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			ps.setString(4, s4);
			ps.setString(5, s5);
			ps.executeUpdate();
			ps.close();
			}
			else if(ch == 2) {
				String str1 = "update customer set firstname = ?, lastname = ?, address = ?, emailId = ? Where id = ?";
				Scanner up = new Scanner(System.in);
				
				// Id you need to update
				System.out.println("Which Id you want to update");
				String s5 = up.nextLine();
				// Update the data 
				System.out.println("Enter Updated FirstName:");
				String s1 = up.nextLine();
				
				System.out.println("Enter Updated LastName:");
				String s2 = up.nextLine();
				
				System.out.println("Enter updated address:");
				String s3 = up.nextLine();
				
				System.out.println("Enter updated Email Id:");
				String s4 = up.nextLine();
				try {
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(str1);
				ps.setString(1, s1);
				ps.setString(2, s2);
				ps.setString(3, s3);
				ps.setString(4, s4);
				ps.setString(5,s5);
				ps.executeUpdate();}
				catch(SQLException e) {
					e.printStackTrace();
				}
				
			}
			else if(ch == 3) {
				Scanner sc = new Scanner(System.in);
				String str3 = "delete from customer where id = ?";
				System.out.print("Enter the ID you want to Delete :");
				int d1 = sc.nextInt();
				PreparedStatement ds = (PreparedStatement) con.prepareStatement(str3);
				
				ds.setInt(1, d1);
				ds.executeUpdate();
				ds.close();
				
			}
			else if(ch == 4) {
				
				java.sql.Statement stat = con.createStatement();
				ResultSet res = stat.executeQuery("select * from customer");
				while(res.next())
				{
					System.out.println("User Id is :" + res.getInt("Id"));
					System.out.println("First Name is :" + res.getString("firstName"));
					System.out.println("Last Name is :" + res.getString("lastName"));
					System.out.println("Address is :" + res.getString("address"));
					System.out.println("Email Id is :" + res.getString("emailId"));
					System.out.println("======================================");
				}
				
			}
			else if(ch == 5) {
				System.out.println("thanks for using");
				break;
			}
			else {
				System.out.println("Pass the correct Value in console:");
			}
		
		}	
		
	}
}
