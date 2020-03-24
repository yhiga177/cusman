<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登録完了</title>
</head>
<body>
		<% request.setCharacterEncoding("utf-8"); %>

		<h2>登録しました</h2>

		<html:form action="/register_item">
		<html:submit value="続けて登録"/>
		</html:form>

		<html:form action="/login">
		<html:submit value="閉じる"/>
		</html:form>

</body>
</html>