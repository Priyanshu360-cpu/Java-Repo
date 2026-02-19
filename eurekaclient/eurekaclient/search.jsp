<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Search</title>

<style>
body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background-color: #f4f6f9;
    margin: 0;
    padding: 0;
}

.container {
    width: 90%;
    max-width: 1100px;
    margin: 50px auto;
}

h2 {
    margin-bottom: 5px;
}

.text-center {
    text-align: center;
}

.text-muted {
    color: #777;
}

.card {
    background: #ffffff;
    border-radius: 12px;
    box-shadow: 0 4px 15px rgba(0,0,0,0.08);
    margin-bottom: 30px;
    overflow: hidden;
}

.card-header {
    background-color: #212529;
    color: white;
    padding: 15px;
    font-weight: 600;
}

.card-body {
    padding: 25px;
}

.row {
    display: flex;
    gap: 20px;
    flex-wrap: wrap;
}

.col {
    flex: 1;
    min-width: 250px;
}

label {
    display: block;
    margin-bottom: 6px;
    font-weight: 600;
}

input[type="text"] {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 6px;
    font-size: 14px;
    transition: 0.3s;
}

input:focus {
    border-color: #007bff;
    outline: none;
    box-shadow: 0 0 5px rgba(0,123,255,0.3);
}

.button-group {
    text-align: center;
    margin-top: 25px;
}

.btn {
    padding: 10px 18px;
    font-size: 14px;
    border-radius: 6px;
    cursor: pointer;
    border: none;
    text-decoration: none;
    display: inline-block;
    margin: 5px;
    transition: 0.3s;
}

.btn-primary {
    background-color: #007bff;
    color: white;
}

.btn-primary:hover {
    background-color: #0056b3;
}

.btn-secondary {
    background-color: #6c757d;
    color: white;
}

.btn-secondary:hover {
    background-color: #545b62;
}

.table-container {
    overflow-x: auto;
}

table {
    width: 100%;
    border-collapse: collapse;
}

table th, table td {
    padding: 10px;
    border: 1px solid #ddd;
    text-align: left;
}

table th {
    background-color: #212529;
    color: white;
}

table tr:nth-child(even) {
    background-color: #f2f2f2;
}

.badge {
    display: inline-block;
    padding: 5px 10px;
    background-color: #17a2b8;
    color: #000;
    border-radius: 20px;
    font-size: 12px;
    font-weight: 600;
}

.alert {
    background-color: #fff3cd;
    color: #856404;
    padding: 15px;
    border-radius: 6px;
    text-align: center;
    margin-top: 20px;
    border: 1px solid #ffeeba;
}
</style>
</head>

<body>

<div class="container">

    <div class="text-center">
<h2>
    <a href="/casestudy" style="text-decoration:none; margin-right:10px;">
        ←
    </a>
    Employee Search
</h2>
        <p class="text-muted">Search employees by name or position</p>
    </div>

    <div class="card">
        <div class="card-body">

            <form method="get"
                action="${pageContext.request.contextPath}/employee/search">

                <div class="row">

                    <div class="col">
                        <label>First Name</label>
                        <input type="text" name="firstName"
                            value="${firstName}"
                            placeholder="Enter first name">
                    </div>

                    <div class="col">
                        <label>Last Name</label>
                        <input type="text" name="lastName"
                            value="${lastName}"
                            placeholder="Enter last name">
                    </div>

                    <div class="col">
                        <label>Position</label>
                        <input type="text" name="position"
                            value="${position}"
                            placeholder="Enter position">
                    </div>

                </div>

                <div class="button-group">
                    <button type="submit" class="btn btn-primary">
                        Search
                    </button>

                    <a href="${pageContext.request.contextPath}/search"
                        class="btn btn-secondary">
                        Reset
                    </a>
                </div>

            </form>

        </div>
    </div>

    <c:if test="${not empty users}">
        <div class="card">

            <div class="card-header">
                Search Results
            </div>

            <div class="card-body table-container">

                <table>
                    <thead>
                        <tr>
                            <th>First</th>
                            <th>Middle</th>
                            <th>Last</th>
                            <th>Position</th>
                            <th>Birth Date</th>
                            <th>Compensation</th>
                            <th>Edit</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach items="${users}" var="u">
                            <tr>
                                <td>${u.firstName}</td>
                                <td>${u.middleName}</td>
                                <td>${u.lastName}</td>
                                <td>
                                    <span class="badge">
                                        ${u.position}
                                    </span>
                                </td>
                                <td>${u.birthDate}</td>
                                <td>
                                    <a href="/casestudy/compensation/?id=${u.id}">
                                        View
                                    </a>
                                </td>
                                <td>
                                    <a href="/casestudy/employee/edit-employee?id=${u.id}">
                                        Edit
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>
    </c:if>

    <c:if
        test="${empty users and (not empty firstName or not empty lastName or not empty position)}">
        <div class="alert">
            No users found matching your criteria.
        </div>
    </c:if>

</div>

</body>
</html>
