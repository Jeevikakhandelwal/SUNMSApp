package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class ReDirectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//Setting MIMIE Type
		response.setContentType("text/html");
		
		//Getting PrintWriter stream to write the response
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title>Response</title></head>");
		out.println("<body>");
		
		out.println("<h1 style='color:red; text-align:center;'>To get service from Oracle</h1>");
		out.println("<h1 style='color:red; text-align:center;'>Click on the following link</h1>");
		out.println("<h1 style='color:red; text-align:center;'><a href='http://localhost:9999/oracle/login.html'>|CC@Oracle.com|</a></h1>");
		out.println("</body></html>");
		
		//Closing Stream
		out.close();
	}

}
