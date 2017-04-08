<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h3>修改联系人</h3></center>
<form action="updateContact" method="post">
	<table border="1" align="center" width="300px">
		<tr>
			<th>姓名</th>
			<td>
				<input type="text" name="name" readonly="readonly" value="${contact.name }">
			</td>
		</tr>
		<tr>
			<th>年龄</th>
			<td>
				<input type="text" name="age" value="${contact.age }">
			</td>
		</tr>
		<tr><th>性别</th>
			<td>
				<input type="radio" name="gender" value="male"  <c:if test="${contact.gender=='male' }">checked="checked"</c:if> />男
        		<input type="radio" name="gender" value="female"  <c:if test="${contact.gender=='female' }">checked="checked"</c:if> />女
        	</td>
		</tr>
		<tr>
			<th>邮箱</th>
			<td>
				<input type="text" name="email" value="${contact.email }">
			</td>
		</tr>
	</table>
	<center><button>提交</button></center>
</form>
</body>
</html>