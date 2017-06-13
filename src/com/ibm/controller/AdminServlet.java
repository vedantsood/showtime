package com.ibm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.RegModel;
import com.ibm.showtime.SHOWTIME;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//get all values from request object.
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String dob=request.getParameter("dob");
		String contact=request.getParameter("contact");
		String password=request.getParameter("password");
		
		//set all values inside model class
		RegModel obj=new RegModel();
		obj.setName(name);
		obj.setEmail(email);
		obj.setDob(dob);
		obj.setContact(contact);
		obj.setPassword(password);
		
		String sql="insert into admindata(name,email,dob,contact,password)values(?,?,?,?,?)";
		
		SHOWTIME obj1=new SHOWTIME();
		String msg=obj1.InsertAdminData(obj, sql);
		if(msg.equals("success"))
		{
			response.sendRedirect("AdminLogin.jsp");
		}
		else
		{
			response.sendRedirect("AdminRegister.jsp");	
		}
			
		
		
	}

}
