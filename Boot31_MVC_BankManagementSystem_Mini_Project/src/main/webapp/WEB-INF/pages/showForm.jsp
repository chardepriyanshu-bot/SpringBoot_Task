<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Segoe UI, Tahoma, Geneva, Verdana, sans-serif;
}

body{
    background:linear-gradient(135deg,#0f4c81,#4facfe);
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    width:450px;
    background:#ffffff;
    padding:35px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,.25);
}

h1{
    text-align:center;
    color:#0d6efd;
    margin-bottom:25px;
}

.form-group{
    margin-bottom:18px;
}

label{
    display:block;
    font-weight:bold;
    margin-bottom:8px;
    color:#333;
}

input{
    width:100%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:6px;
    font-size:15px;
}

input:focus{
    border-color:#0d6efd;
    outline:none;
    box-shadow:0 0 6px rgba(13,110,253,.3);
}

.button-group{
    display:flex;
    justify-content:space-between;
    margin-top:25px;
}

.btn{
    width:48%;
    padding:12px;
    border:none;
    border-radius:6px;
    font-size:16px;
    font-weight:bold;
    cursor:pointer;
}

.submit{
    background:#0d6efd;
    color:white;
}

.submit:hover{
    background:#084298;
}

.reset{
    background:#dc3545;
    color:white;
}

.reset:hover{
    background:#bb2d3b;
}

.home{
    text-align:center;
    margin-top:20px;
}

.home a{
    text-decoration:none;
    color:#0d6efd;
    font-weight:bold;
}

</style>

</head>

<body>

<div class="container">

<h1>Customer Registration</h1>

<form action="viewCustomer" method="post">

    <div class="form-group">
        <label>Customer Name</label>
        <input type="text" name="customerName"
               placeholder="Enter Customer Name" required>
    </div>

    <div class="form-group">
        <label>Email</label>
        <input type="email" name="email"
               placeholder="Enter Email Address" required>
    </div>

    <div class="form-group">
        <label>Mobile Number</label>
        <input type="text" name="mobile"
               placeholder="Enter Mobile Number" required>
    </div>

    <div class="form-group">
        <label>Address</label>
        <input type="text" name="address"
               placeholder="Enter Address" required>
    </div>

    <div class="form-group">
        <label>Aadhar Number</label>
        <input type="text" name="aadharNumber"
               placeholder="Enter 12-digit Aadhar Number" required>
    </div>

    <div class="button-group">
        <input type="submit" value="Register" class="btn submit">
        <input type="reset" value="Reset" class="btn reset">
    </div>

</form>

<div class="home">
    <a href="${pageContext.request.contextPath}/home">Back to Home</a>
</div>

</div>

</body>
</html>