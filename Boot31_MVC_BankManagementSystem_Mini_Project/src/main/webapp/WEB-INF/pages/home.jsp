<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Management System</title>

<style>
    body{
        font-family: Arial, sans-serif;
        background: #f2f2f2;
        margin:0;
        padding:0;
    }

    .header{
        background:#0d6efd;
        color:white;
        padding:20px;
        text-align:center;
    }

    .container{
        width:80%;
        margin:40px auto;
        text-align:center;
    }

    .card{
        display:inline-block;
        width:250px;
        background:white;
        margin:20px;
        padding:25px;
        border-radius:10px;
        box-shadow:0 2px 10px rgba(0,0,0,0.2);
    }

    .card h3{
        color:#0d6efd;
    }

    .btn{
        display:inline-block;
        margin-top:15px;
        padding:10px 20px;
        background:#0d6efd;
        color:white;
        text-decoration:none;
        border-radius:5px;
    }

    .btn:hover{
        background:#084298;
    }

    footer{
        text-align:center;
        margin-top:40px;
        padding:15px;
        background:#212529;
        color:white;
    }
</style>
</head>

<body>

<div class="header">
    <h1>Bank Management System</h1>
    <p>Welcome to Online Banking Portal</p>
</div>

<div class="container">

    <div class="card">
        <h3>Customer Registration</h3>
        <p>Register a new customer.</p>
        <a href="register" class="btn">Register</a>
    </div>

    <div class="card">
        <h3>Open Account</h3>
        <p>Create a new bank account.</p>
        <a href="registerAccount" class="btn">Open Account</a>
    </div>

    <div class="card">
        <h3>View Customers</h3>
        <p>See all registered customers.</p>
        <a href="viewCustomer" class="btn">View</a>
    </div>

    <div class="card">
        <h3>Transactions</h3>
        <p>Deposit, Withdraw & Transfer Money.</p>
        <a href="transaction/home" class="btn">Transactions</a>
    </div>
    <div class="card">
        <h3>Loan</h3>
        <p>Apply for Loan</p>
        <a href="loanRegister" class="btn">Loan</a>
    </div>

</div>

<footer>
    © 2026 Bank Management System | Spring Boot MVC
</footer>

</body>
</html>