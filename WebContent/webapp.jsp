<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>アイテムリスト</title>
</head>

<body>

<% request.setCharacterEncoding("utf-8"); %>
<html:form action="/register_item">
<html:submit value="新規登録"/>
</html:form>

	<div>
		<table border="1" style="border-collapse: collapse">
			<tr>
				<th>商品ID</th>
				<th>商品名</th>
				<th>値段</th>
				<th>説明</th>
			</tr>

			<logic:iterate id="value" name="value">
				<tr>
					<td><bean:write name="value" property="num" /></td>
					<td><bean:write name="value" property="itemName" /></td>
					<td><bean:write name="value" property="price" /></td>
					<td><bean:write name="value" property="description" /></td>
				</tr>
			</logic:iterate>
		</table>
	</div>
</body>
</html>