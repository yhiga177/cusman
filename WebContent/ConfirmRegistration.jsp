<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登録内容確認</title>
</head>
<body>
		<% request.setCharacterEncoding("utf-8"); %>
		<h2>登録内容確認</h2>
		<p>商品名： <bean:write name="value" property="itemName" /> </p>
		<p>価格： <bean:write name="value" property="price" /> </p>
		<p>説明： <bean:write name="value" property="description" /> </p>

		<html:form action="/register_item">
		 <html:hidden name="value" property="itemName" />
 		<html:hidden name="value" property="price" />
 		<html:hidden name="value" property="description" />
		<html:submit value="修正する"/>
		</html:form>

 		<html:form action="/registration_done">
 		<html:hidden name="value" property="itemName" />
 		<html:hidden name="value" property="price" />
 		<html:hidden name="value" property="description" />
		<html:submit value="この内容で登録する"/>
		</html:form>
</body>
</html>