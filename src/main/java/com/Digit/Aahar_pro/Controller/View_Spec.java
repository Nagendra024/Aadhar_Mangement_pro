package com.Digit.Aahar_pro.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Digit.Aahar_pro.bean.AadharDetails;
import com.Digit.Aahar_pro.model.HibernateManager;

@WebServlet("/view_spx")
public class View_Spec extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int a_id = Integer.parseInt(req.getParameter("a_id"));

		HibernateManager n1=new HibernateManager();
		HttpSession session = req.getSession();
		AadharDetails usr= n1.readSpecific(a_id);
		session.setAttribute("spx",usr);
		resp.sendRedirect("/Aadhar_Mangement_Pro/View_spx.jsp");
		}
	}

