<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form saved here</title>
</head>
<body>

<h3>Employee Details</h3>

<form:form action="delete" method="post" modelAttribute="employee">

    Name:
    <form:input path="name" readonly="true" />
    <br><br>

    Phone:
    <form:input path="phone" readonly="true" />
    <br><br>

    Email:
    <form:input path="email" readonly="true" />
    <form:errors path="email" style="color:red;" />
    <br><br>

    <input type="submit" value="Delete Employee" />

</form:form>

</body>
</html>
