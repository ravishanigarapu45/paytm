package com.paytm;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	try{
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/Paytm", "root", "root");
		
		System.out.println("The recharge amount is: "+req.getParameter("amount"));
		System.out.println("The mobile num is: "+req.getParameter("mobilenumber"));
		System.out.println("The network is: "+req.getParameter("network"));
		
		PreparedStatement prepareStatement1 = connection
				.prepareStatement("SELECT * FROM mytable where mobilenumber=?");

		prepareStatement1.setString(1, req.getParameter("mobilenumber"));
		ResultSet rs = prepareStatement1.executeQuery();

		if(rs.next()){
		PreparedStatement prepareStatement = connection
				.prepareStatement("insert into paytm.mobileinfo(mobilenumber,network,recharge) values(?,?,?)");

		prepareStatement.setString(1, req.getParameter("mobilenumber"));
		prepareStatement.setString(2, req.getParameter("network"));
		
		prepareStatement.setString(3, req.getParameter("amount"));
		
		int executeUpdate = prepareStatement.executeUpdate();
		System.out.println("the value of the query is: " + executeUpdate);
		if (executeUpdate == 1) {
			//System.out.println("recharge success");
			resp.sendRedirect("RechargeSuccess.jsp");
		} else {
			System.out.println("Not inserted ");
			req.setAttribute("Ravi", "recharge failed");
			resp.sendRedirect("HomePage.jsp");
		}

		}else{
			System.out.println("invalid mobile number");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

	


}

