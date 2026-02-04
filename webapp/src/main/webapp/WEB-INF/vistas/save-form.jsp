<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Dashboard</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f5f5f5;
    }
.header-actions {
    display: flex;
    gap: 8px;           /* control spacing here */
}

.header-actions form {
    margin: 0;          /* remove default form margin */
}

.logout-btn {
    background-color: #3498db;
}

    .header {
        background-color: #2c3e50;
        color: white;
        padding: 15px;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .container {
        width: 60%;
        margin: 40px auto;
        background: white;
        padding: 25px;
        border-radius: 6px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    table {
        width: 100%;
        border-collapse: collapse;
    }

    td {
        padding: 10px;
        border-bottom: 1px solid #ddd;
    }

    .delete-btn {
        background-color: #e74c3c;
        color: white;
        border: none;
        padding: 8px 14px;
        cursor: pointer;
        border-radius: 4px;
    }

    .delete-btn:hover {
        background-color: #c0392b;
    }

    .error {
        color: red;
        margin-top: 10px;
    }
</style>

</head>
<body>

<!-- Header -->
<div class="header">
    <h2>Welcome, ${employee.name}</h2>

  <div class="header-actions">
        <form:form action="delete" method="post" modelAttribute="employee">
            <form:hidden path="email"/>
            <input type="submit" value="Delete" class="delete-btn" />
        </form:form>

        <form action="form" method="get">
            <input type="submit" value="Logout"
                   class="delete-btn logout-btn" />
        </form>
    </div>
</div>

<!-- Content -->
<div class="container">
    <h3>Employee Details</h3>

    <table>
        <tr>
            <td><strong>Name</strong></td>
            <td>${employee.name}</td>
        </tr>
        <tr>
            <td><strong>Phone</strong></td>
            <td>${employee.phone}</td>
        </tr>
        <tr>
            <td><strong>Email</strong></td>
            <td>${employee.email}</td>
        </tr>
    </table>

    <div class="error">
        <form:errors path="email" />
    </div>
</div>

</body>
</html>
