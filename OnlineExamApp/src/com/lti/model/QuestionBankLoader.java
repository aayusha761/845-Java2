package com.lti.model;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Question.Difficulty;

public class QuestionBankLoader {
	
	public List<Question> loadQuestionsOnJava() {
		
		String subjectName = "Java";
		QuestionBank qb = new QuestionBank();
		
		qb.addNewSubject(subjectName);
		
		Question q = new Question("What is Java?", Difficulty.EASY);
		List<Option> ops = new ArrayList<Option>();
		
		ops.add(new Option("Java is a database", false));
		ops.add(new Option("Java is a Programming language", true));
		ops.add(new Option("Java is a OS", false));
		ops.add(new Option("Java is a file system", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
			
		
		
		q = new Question("What is G1?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		
		
		q = new Question("What is C1?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		
		
		q = new Question("What is D1?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is E1?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is F1?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);

		q = new Question("What is G1?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is H1?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is I1?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		
		ops.add(new Option("wrong", false));
		ops.add(new Option("right", true));
		ops.add(new Option("wrong", false));
		ops.add(new Option("wrong", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		return qb.getQuestionFor(subjectName);
	}
}
