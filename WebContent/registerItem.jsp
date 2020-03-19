<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>アイテム新規登録</title>
</head>

<body>
	<%-- 	<% request.setCharacterEncoding("utf-8"); %> --%>

		<html:form action="/login">
		<html:submit value="キャンセル"/>
		</html:form>

		<%	String itemName = request.getParameter("itemName");
			String price = request.getParameter("price");
			String description = request.getParameter("description");
			String message = request.getParameter("message");
			System.out.println("registerItem.jsp");%>

		<html:form action="/confirm_registration">
		<html:submit value="登録内容を確認"/>
			<h1>アイテム新規登録</h1>
			<% if ( message != null ) { %>
			<p>
				<font color="red"> <bean:write name="value" property="message" /></font>
			</p>
			<% } %>
			<html:hidden property="message" value="<%= message %>"/>
			<p>
				商品名：<html:text property="itemName" value="<%=itemName%>"/>
			</p>
			<p>
				価格：<html:text property="price" value="<%=price%>"/>
			</p>
			<p>
				説明：<br>
				<html:textarea property="description" cols="30" rows="5" value="<%=description%>"/>
			</p>
		</html:form>
</body>
</html>