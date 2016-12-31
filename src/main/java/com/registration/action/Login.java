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

import com.registration.ServiceI.RegisterationServiceI;
import com.registration.SeviceImpl.RegistrationServiceImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession session= request.getSession();
		PrintWriter out = response.getWriter();
		RequestDispatcher rd=null;
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
	
		RegisterationServiceI rsi=new RegistrationServiceImpl();
		
		if(rsi.login(email, password)){
			session.setAttribute("user", email);
					
			rd=request.getRequestDispatcher("/home.jsp");
			rd.include(request, response);
		}
			else{ 
				rd=request.getRequestDispatcher("/login.jsp");
				rd.include(request, response);
				out.print("Invalid Credentials...Please try again...");
			
		}

}}
