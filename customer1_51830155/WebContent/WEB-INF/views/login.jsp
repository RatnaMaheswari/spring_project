<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer app login page!</title>
<style type="text/css">
.error {
	color: red;
}
h4{
color: yellow;
}
body {
	background-image: url(C:/Users/Coalesce/Desktop/34.jpg);
}
</style>


</head>

<body>
<center>
${message}
	<form:form action="login" method="post" modelAttribute="userbean">
	<h4>Enter email:<form:input path="email"/><form:errors path="email" class="error"/><br /></h4>
		<h4>Enter password:<form:input path="password" type="password"/><form:errors path="password" class="error"/><br /></h4>
		<input type="submit"/>
	</form:form>
	</center>
</body>
</html>