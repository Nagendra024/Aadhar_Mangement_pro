package com.Digit.Aahar_pro.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Digit.Aahar_pro.bean.AadharDetails;
import com.Digit.Aahar_pro.model.HibernateManager;

@WebServlet("/update")
public class UpdateAadhar extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int a_id = Integer.parseInt(req.getParameter("a_id"));
		String selopt = req.getParameter("selopt");

		String det = req.getParameter("det");

			
		HibernateManager hb1 = new HibernateManager();

		
		hb1.updateDet(a_id,selopt,det);
		
		resp.sendRedirect("/Aadhar_Mangement_Pro/Home.html");

	}
}
