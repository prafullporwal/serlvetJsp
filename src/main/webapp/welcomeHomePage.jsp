<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome <%=request.getParameter("name") %> to home page</title>
</head>
<body>
<h1><a href="viewEmployeePage.jsp?page=1">View Employees</a> </h1>
</body>
</html>