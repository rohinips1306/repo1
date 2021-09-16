package com.beans;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  doPost(req,res);
	}
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		System.out.println("request reached");
		

		String username=req.getParameter("cn");
		String password=req.getParameter("pwd");
		Insurance s1=new Insurance(username,password);
		PrintWriter pw=res.getWriter();
		DbOperation dop=new DbOperation();
		Boolean a=dop.loginCheck(username, password);
		if(a==true)
		{
			
			RequestDispatcher rd=req.getRequestDispatcher("details.jsp");
			rd.forward(req,res);
		}
		else
		{
			pw.println("Wrong Username or password");
			RequestDispatcher rd=req.getRequestDispatcher("client.jsp");
			rd.include(req,res);
		}
	}
}
