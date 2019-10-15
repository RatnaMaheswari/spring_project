<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add customer page</title>
<style type="text/css">
.errors{
color:orange;
font-family: serif;
font-style: italic;
}
body {
  background: #ffffff url("img_tree.png") no-repeat right top;
}
</style>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customer">

Enter name:<form:input path="name"/><form:errors path="name" class="errors"/><br/>
Enter email:<form:input path="email"/><form:errors path="email" class="errors"/><br/>
Enter phoneNo:<form:input path="phoneNo"/><form:errors path="phoneNo" class="errors"/><br/>
Enter address:<form:input path="address"/><form:errors path="address" class="errors"/><br/>

<input type="submit">
</form:form>
</body>
</html>