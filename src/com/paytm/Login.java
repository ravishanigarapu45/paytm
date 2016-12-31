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
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		System.out.println("Entered");
	String userName = req.getParameter("username");
		String password = req.getParameter("pswd");
	try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/Paytm", "root", "root");

			PreparedStatement prepareStatement = connection
					.prepareStatement("select * from Paytm.mytable where mail=? and password=?");
			prepareStatement.setString(1, userName);
			prepareStatement.setString(2, password);
			System.out.println("executing");
			ResultSet rs = prepareStatement.executeQuery();
			if (rs.next() == false) {
				resp.sendRedirect("Pay.jsp");
				req.setAttribute("loginmsg",
						"Login faied. Please provide correct details");

		} else {
			
			resp.sendRedirect("HomePage.jsp");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
