package com.beans;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{

	
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  doPost(req,res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		System.out.println("request reached");
		String id=req.getParameter("id");
		String clnumber=req.getParameter("cn");
		String cltype=req.getParameter("cntype");
		String dob=req.getParameter("dob");
		String mobile=req.getParameter("mob");
		String address=req.getParameter("addrr");
		String state=req.getParameter("st");
		String inamount=req.getParameter("ia");
		String name=req.getParameter("username");
		String password=req.getParameter("pwd");
		String age=req.getParameter("age");
		String gender=req.getParameter("gen");
		String email=req.getParameter("em");
		String city=req.getParameter("city");
		String nation=req.getParameter("nation");
		String noofpay=req.getParameter("nop");
		String datec=req.getParameter("doc");

		Insurance i=new Insurance(id,clnumber,cltype,dob, mobile,address,state,inamount,name,password,age,gender,email,city,nation,noofpay,datec);
		DbOperation dop=new DbOperation();
		
		if(id.isEmpty()||
		   clnumber.isEmpty()||
		   cltype.isEmpty()||
		   dob.isEmpty()||
		   mobile.isEmpty()||
		   address.isEmpty()||
		   state.isEmpty()||
		   inamount.isEmpty()||
		   name.isEmpty()||
		   password.isEmpty()||
		   age.isEmpty()||
		   gender.isEmpty()||
		   email.isEmpty()||
		   city.isEmpty()||
		   nation.isEmpty()||
		   noofpay.isEmpty()||
		   datec.isEmpty())
		{
			 RequestDispatcher rd = req.getRequestDispatcher("newclient.jsp");
	            rd.include(req, res);
		}
		else
		{
			dop.insert(i);
			RequestDispatcher rd = req.getRequestDispatcher("client.jsp");
            rd.forward(req, res);
		}
		
}
}
