package com.ibm.showtime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.ibm.model.RegModel;

public class SHOWTIME {
	
	
	
	public static String drivername="com.mysql.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/mydb";
	public static String username="root";
	public static String password="password";
	public static Connection con=null;
	
	
	static
	{
		
		try {
			Class.forName(drivername);
			con=DriverManager.getConnection(url,username,password);
		    System.out.println("connected");
		
		   } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public String InsertAdminData(RegModel obj,String sql){
		
		
		try
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,obj.getName());
			ps.setString(2,obj.getEmail());
			ps.setString(3,obj.getDob());
			ps.setString(4,obj.getContact());
			ps.setString(5,obj.getPassword());
			int i=ps.executeUpdate();
			if(i==1)
			{
				return "success";
			}
			else
			{
				return "fail";
			}
			
			
		}
		catch(Exception e)
		{
			
			
		}
		
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
