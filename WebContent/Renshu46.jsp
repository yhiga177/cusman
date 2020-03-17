<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=UTF-8" import = "model.Employee" %>

<%
Employee emp = new Employee("00001","namae");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p style = "color:red">
<% for(int i = 1 ; i <= 10 ; i++) { %>
<% 	if(i == 1 || i == 4 || i == 7 || i == 10) { %>
 		<p style = "color:red">
<% 	} else {%>
		<p>
<% 	}%>
	IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です</p>

<% } %>

	<form action="/Serlet/FormSampleServlet" method="post">
	名前：<input type="text" name="text" value="name">
	性別：
	男<input type="radio" name="gender" value="0">
	女<input type="radio" name="gender" value="1">
	<input type = "submit" value="送信">
	</form>

</body>
</html>