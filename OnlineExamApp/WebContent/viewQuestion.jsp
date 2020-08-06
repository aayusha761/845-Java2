<%@page import="java.util.List"%>
<%@page import="com.lti.model.Question"%>
<%@page import="com.lti.model.Option"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AnswerCheckServlet">
<%
	Question qs = (Question) session.getAttribute("nextQs");
	Integer qNo = (Integer) session.getAttribute("qNo");
%>

<h2>Q.<%=qNo %> <%= qs.getQuestion() %></h2>
<%
	List<Option> ops = qs.getOptions();
	int opNo = 0;
	for(Option op: ops) {
%>
	<input type="radio" name="op" value="<%= opNo++ %>"/>
	<%= op.getOption() %><br/>
	
<% } %>


<!-- <a href="QuestionLoaderServlet">Next Question</a>

<a href="QuestionLoaderServlet?q=next">Next Question</a>
<a href="QuestionLoaderServlet?q=prev">Prev Question</a> -->
<button type='submit'>Continue</button>

</form>
</body>
</html>