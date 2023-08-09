package com.Digit.Aahar_pro.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Digit.Aahar_pro.model.HibernateManager;

@WebServlet("/View")
public class View extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HibernateManager hb=new HibernateManager();
	HttpSession session = req.getSession();
	
	session.setAttribute("lists",hb.readAll());
	resp.sendRedirect("/Aadhar_Mangement_Pro/View.jsp");
}
}
