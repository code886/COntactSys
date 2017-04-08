<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h3>添加联系人</h3></center>
<form action="addContact" method="post">
	<table border="1" align="center" width="300px">
		<tr><th>姓名</th><td><input type="text" name="name"></td></tr>
		<tr><th>年龄</th><td><input type="text" name="age"></td></tr>
		<tr><th>性别</th><td>男<input type="radio" checked="checked" name="gender" value="male"><br/>
							女<input type="radio"  name="gender" value="female">
			</td>
		</tr>
		<tr><th>邮箱</th><td><input type="text" name="email"></td></tr>
	</table>
	<center><button>提交</button></center>
</form>
</body>
</html>