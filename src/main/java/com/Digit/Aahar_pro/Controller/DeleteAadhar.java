package com.Digit.Aahar_pro.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Digit.Aahar_pro.model.HibernateManager;

@WebServlet("/delete")
public class DeleteAadhar extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int a_id= Integer.parseInt(req.getParameter("a_id"));
		 
		HibernateManager dhbm= new HibernateManager();
		dhbm.delete(a_id);
		
		resp.sendRedirect("/Aadhar_Mangement_Pro/Home.html");
 
		

}
}
