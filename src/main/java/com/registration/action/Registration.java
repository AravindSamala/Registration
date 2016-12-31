package com.registration.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.registration.Dto.Pojo;
import com.registration.ServiceI.RegisterationServiceI;
import com.registration.SeviceImpl.RegistrationServiceImpl;

import regvalidation.RValidator;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {

	final static Logger log = Logger.getLogger(Registration.class);
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registration() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;

		String fname = request.getParameter("fname");
		log.info("fname accepted");
		String lname = request.getParameter("lname");
		log.info("lname accepted");
		String sex = request.getParameter("sex");
		log.info("gender accepted");
		String cardno = request.getParameter("cardno");
		log.info("cardno accepted");
		String mobile = request.getParameter("mobile");
		log.info("mobile no accepted");
		String email = request.getParameter("email");
		log.info("email id accepted");
		String password = request.getParameter("password");
		log.info("password accepted");
		String confirmpassword = request.getParameter("confirmpassword");
		log.info("confirm password accepted");

		boolean fname1 = RValidator.fname(fname);
		log.info("fname is valid");
		boolean lname1 = RValidator.lname(lname);
		log.info("lname is valid");
		boolean cardno1 = RValidator.cardno(cardno);
		log.info("cardno is valid");
		boolean mobile1 = RValidator.mobile(mobile);
		log.info("mobileno is valid");
		boolean email1 = RValidator.email(email);
		log.info("email id is valid");
		boolean password1 = RValidator.password(password);
		log.info("password is valid");

		boolean confirmpassword1 = false;
		if (password.equals(confirmpassword))
			confirmpassword1 = true;
		log.info("confirm password id valid");

		if (fname1 && lname1 && cardno1 && mobile1 && email1 && password1 && confirmpassword1) {
			log.info("All the deatailes are entered correctly");
			Pojo p = new Pojo();
			log.info("pojo class object is created");

			p.setFname(fname);
			log.info("fname assigned to pojo object");
			p.setLname(lname);
			log.info("lname assigned to pojo object");
			p.setSex(sex);
			log.info("Gender assigned to pojo object");
			p.setCardno(cardno);
			log.info("cardno assigned to pojo object");
			p.setMobile(mobile);
			log.info("mobile no assigned to pojo object");
			p.setEmail(email);
			log.info("email id assigned to pojo object");
			p.setPassword(password);
			log.info("password assigned to pojo objecet");
			p.setConfirmpassword(confirmpassword);
			log.info("confirm password is assigned to pojo object");

			RegisterationServiceI rsi = new RegistrationServiceImpl();
			log.info("serviceImpl object created");

			int res = rsi.register(p);

			if (res == 1) {
				log.info("Record inserted in Database");
				/*rd = request.getRequestDispatcher("registration.jsp");
				rd.include(request, response);
				*/

				rd = request.getRequestDispatcher("login.jsp");
				
				rd.include(request, response);
				out.print("Thank You for Registering...");


				log.info("Registration Successfull and Page redirected to Registration.jsp");
			} else {
				log.info("Registration Failed and Page redirected to Registration.jsp");
				rd = request.getRequestDispatcher("registration.jsp");
				rd.include(request, response);
				out.print("Registration Failed..Please Try again later...");
			}
		} else {

			rd = request.getRequestDispatcher("registration.jsp");
			rd.include(request, response);
			out.print("Please Enter  All the fields Correctly...");

			log.info(" Details entered incorectly and Page redirected to Registration.jsp");

		}
	}
}
