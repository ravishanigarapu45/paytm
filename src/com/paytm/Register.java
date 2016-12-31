package com.paytm;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		System.out.println("the gender is ; "+req.getParameter("gender"));
		try{
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/Paytm", "root", "root");
		
		
		PreparedStatement prepareStatement = connection
				.prepareStatement("insert into paytm.mytable(id,fname,lname,mobilenumber,mail,password) values(?,?,?,?,?,?)");

		prepareStatement.setString(1, req.getParameter("id"));
		prepareStatement.setString(2, req.getParameter("fname"));
		prepareStatement.setString(3, req.getParameter("lname"));
		prepareStatement.setString(4, req.getParameter("mobilenumber"));
		prepareStatement.setString(5, req.getParameter("mail"));
		prepareStatement.setString(6, req.getParameter("password"));
		
		int executeUpdate = prepareStatement.executeUpdate();
		System.out.println("the value of the query is: " + executeUpdate);
		if (executeUpdate == 1) {
			//System.out.println("inserted successfully in database");
			//req.setAttribute("Ravi", "The values are inserted successfully");
			resp.sendRedirect("Pay.jsp");
		} else {
			System.out.println("Not inserted ");
			req.setAttribute("Ravi", "Insertion failed");
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
}

	}


