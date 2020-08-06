package com.lti.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayResultServlet
 */
@WebServlet("/DisplayResultServlet")
public class DisplayResultServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		Integer totalscore = (Integer) session.getAttribute("score");
		out.print("<h3>Your Have Completed the Test</h3>");
		out.print("Your total score is " + totalscore);
		

		Integer totalQuestions = (Integer) session.getAttribute("totalQuestions");
		System.out.println("totalScore : "+totalscore);
		System.out.println("totalQues : "+totalQuestions);
		
		Double percentage = (double) (totalscore / totalQuestions)*100;
		out.print("percentage : "+percentage);
		System.out.println("percentage : "+percentage);
		
		if(percentage > 60) {
			out.print("You have cleared the test with flying colors...");
		}
		else {
			out.print("You have not cleared the test... Reappear the test");
		}
	}
}