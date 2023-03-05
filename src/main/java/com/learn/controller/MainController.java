package com.learn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.LoginBean;

public class MainController extends HttpServlet {
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
	  doPost(req, resp);	
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			 resp.setContentType("text/html"); 
			 PrintWriter out=resp.getWriter(); 
			String name=req.getParameter("name");
			String pass=req.getParameter("passWord");
			LoginBean l=new LoginBean();
			l.setName(name);
			l.setPassWord(pass);
			System.out.println("res"+resp.getContentType());
			boolean validate=l.validate();
			if(validate)
			{
				RequestDispatcher rd = req.getRequestDispatcher("/welcomeHomePage.jsp");
				rd.forward(req, resp);
						}else
						{
							RequestDispatcher rd=req.getRequestDispatcher("loginPage.jsp");
							rd.forward(req, resp);
						}
		}
}
