package org.abhishek.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//For maintaining a session(Per user/browser)
		HttpSession session = request.getSession();
		
		//At servlet level(for all browsers)
		ServletContext context = request.getServletContext();
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("name");
		if (username != null && !username.isEmpty()) {
			session.setAttribute("loggedInUser", username);
			context.setAttribute("loggedInUser", username);
		}
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		out.println("Request parameter has Username as: " + username);
		out.println("Session parameter has Username as: " + (String) session.getAttribute("loggedInUser"));
		out.println("Context parameter has Username as: " + (String) context.getAttribute("loggedInUser"));
		System.out.println("Hello Get Method!!");
	}

}
