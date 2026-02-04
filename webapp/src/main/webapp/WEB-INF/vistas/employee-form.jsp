<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Portal</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f2f2f2;
    }

    .container {
        width: 350px;
        margin: 80px auto;
        background: white;
        padding: 25px;
        border-radius: 6px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    h2 {
        text-align: center;
    }

    .toggle {
        text-align: center;
        margin-bottom: 20px;
    }

    .toggle button {
        border: none;
        padding: 8px 14px;
        cursor: pointer;
        background: #ddd;
    }

    .toggle button.active {
        background: #2c3e50;
        color: white;
    }

    .field {
        margin-bottom: 12px;
    }

    .error {
        color: red;
        font-size: 13px;
    }

    input[type=submit] {
        width: 100%;
        padding: 8px;
        background: #2c3e50;
        color: white;
        border: none;
        cursor: pointer;
    }
</style>

<script>
    function showSignup() {
        document.getElementById("signup").style.display = "block";
        document.getElementById("login").style.display = "none";
        document.getElementById("signupBtn").classList.add("active");
        document.getElementById("loginBtn").classList.remove("active");
    }

    function showLogin() {
        document.getElementById("signup").style.display = "none";
        document.getElementById("login").style.display = "block";
        document.getElementById("loginBtn").classList.add("active");
        document.getElementById("signupBtn").classList.remove("active");
    }
</script>

</head>
<body onload="showSignup()">

<div class="container">

    <h2>Employee Portal</h2>

    <div class="toggle">
        <button id="signupBtn" onclick="showSignup()">Signup</button>
        <button id="loginBtn" onclick="showLogin()">Login</button>
    </div>

    <!-- SIGNUP FORM -->
    <div id="signup">
        <form:form action="save" method="post" modelAttribute="employee">

            <div class="field">
                <form:input path="name" placeholder="Name"/>
                <div class="error">
                    <form:errors path="name"/>
                </div>
            </div>

            <div class="field">
                <form:input path="phone" placeholder="Phone"/>
                <div class="error">
                    <form:errors path="phone"/>
                </div>
            </div>

            <div class="field">
                <form:input path="email" placeholder="Email"/>
                <div class="error">
                    <form:errors path="email"/>
                </div>
            </div>

            <input type="submit" value="Signup"/>
        </form:form>
    </div>

    <!-- LOGIN FORM -->
    <div id="login" style="display:none;">
        <form action="login" method="post">

            <div class="field">
                <input type="email" name="email" placeholder="Email" required/>
            </div>

            <input type="submit" value="Login"/>
        </form>
    </div>

</div>

</body>
</html>
