<%@page import="com.yuanhao.entity.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有联系人</title>
<script type="text/javascript">
	function abc(){
		return window.confirm("您确认要删除吗？");	
	}
</script>
</head>
<body>
<center><h3>所有联系人</h3></center>
<form action="ListServlet" method="post">
	<table align="center" border="1" width="600px">
		<tr>
			<th>姓名</th><th>年龄</th><th>性别</th><th>邮箱</th>
		</tr>
		<c:forEach items="${all }" var="contact">
			<tr>
			<td>${contact.name }</td>
			<td>${contact.age }</td>
			<td>${contact.gender }</td>
			<td>${contact.email }</td>
			<td><a href="queryContact?name=${contact.name}">修改</a></td>
			<td><a onclick="return abc();" href="delContact?name=${contact.name }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</form>
<center><a href="add.jsp">[添加联系人]</a></center>
</body>
</html>