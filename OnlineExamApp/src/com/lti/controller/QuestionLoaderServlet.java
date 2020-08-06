package com.lti.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.model.Question;
import com.lti.model.QuestionBankLoader;

/**
 * Servlet implementation class QuestionLoaderServlet
 */
@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
//	int qNo = 0;
	boolean check = true;
	private int noOfQuestions;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(30);

		QuestionBankLoader qbLoader = new QuestionBankLoader();
		List<Question> listOfQuestions = qbLoader.loadQuestionsOnJava();
		noOfQuestions = listOfQuestions.size();
		session.setAttribute("totalQuestions", noOfQuestions);


		Integer qNo = (Integer) session.getAttribute("qNo");

		
		if (qNo == null) {
			qNo = 0;
			check = true;
		}
		if (qNo == noOfQuestions) {
			check = false;
//			out.print("<h3>Your Have Completed the Test</h3>"+qNo);
			response.sendRedirect("DisplayResultServlet");
		}
		
		if(check) {
			Question nextQuestion = listOfQuestions.get(qNo++);
			
			session.setAttribute("nextQs", nextQuestion);
			session.setAttribute("qNo", qNo);
			
			response.sendRedirect("viewQuestion.jsp");
			
		}
		
	}

}
