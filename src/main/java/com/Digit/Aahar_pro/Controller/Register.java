package com.Digit.Aahar_pro.Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Digit.Aahar_pro.bean.AadharDetails;
import com.Digit.Aahar_pro.model.HibernateManager;

@WebServlet("/regi")
public class Register extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int a_id = Integer.parseInt(req.getParameter("a_id"));
		String u_name = req.getParameter("u_name");
		String dob = req.getParameter("dob");

		String address = req.getParameter("address");
		int pin = Integer.parseInt(req.getParameter("pin"));
		int phone_no = Integer.parseInt(req.getParameter("phone_no"));

		AadharDetails ad=new AadharDetails();
		ad.setA_id(a_id);
		ad.setU_name(u_name);
		ad.setDob(dob);
		ad.setAdress(address);
		ad.setPin(pin);
		ad.setPhone_no(phone_no);
		
		HibernateManager hbm= new HibernateManager();
		if(hbm.saveObj(ad)) {
			resp.sendRedirect("/Aadhar_Mangement_Pro/Home.html");
		}
		
		
	}
}
