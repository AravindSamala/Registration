package com.registration.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Logout() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());

		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();

		if (session != null) {
			System.out.println(session.getAttribute("user"));
			session.removeAttribute("user");
			
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);
			session.invalidate();

			out.print("Logged out Successfully...");
		} 
		else {

			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);
			out.print("Please Login...");

		}
	}

}