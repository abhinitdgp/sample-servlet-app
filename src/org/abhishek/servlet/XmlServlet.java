package org.abhishek.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("userName");
		response.getWriter().append("Hello from GET method: " + name);
		System.out.println("Xml get Method");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("userName");
		PrintWriter out = response.getWriter();
		out.append("Hello from POST method: " + name);
		String fullname = request.getParameter("fullName");
		out.println("Your full Name is: " + fullname);
		String prof = request.getParameter("prof");
		out.println("And your profession is: " + prof);

		out.println("Your places are: ");
		String[] locs = request.getParameterValues("location");
		for (String s : locs)
			out.println(s);
		System.out.println("Xml Post Method");
	}
}
