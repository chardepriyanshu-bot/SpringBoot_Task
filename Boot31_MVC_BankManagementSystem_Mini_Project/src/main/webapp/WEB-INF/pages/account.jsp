<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Registration</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Segoe UI, Tahoma, Geneva, Verdana, sans-serif;
}

body{
    background:linear-gradient(135deg,#1d3557,#457b9d);
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    width:500px;
    background:#fff;
    padding:35px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,.25);
}

h2{
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

input,
select{
    width:100%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:6px;
    font-size:15px;
}

input:focus,
select:focus{
    outline:none;
    border-color:#0d6efd;
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

<h2>Account Registration</h2>

<form action="${pageContext.request.contextPath}/viewAccount" method="post">
    <div class="form-group">
        <label>Account Type</label>
        <select name="accountType" required>
            <option value="">-- Select Account Type --</option>
            <option value="Savings">Savings</option>
            <option value="Current">Current</option>
            <option value="Salary">Salary</option>
        </select>
    </div>

    <div class="form-group">
        <label>Initial Balance</label>
        <input type="number"
               step="0.01"
               name="balance"
               placeholder="Enter Initial Balance"
               required>
    </div>

    <div class="form-group">
        <label>Branch Name</label>
        <input type="text"
               name="branch"
               placeholder="Enter Branch Name"
               required>
    </div>

    <div class="form-group">
        <label>IFSC Code</label>
        <input type="text"
               name="ifscCode"
               placeholder="Enter IFSC Code"
               required>
    </div>

    <div class="form-group">
        <label>Status</label>
        <input type="text"
               name="status"
               value="Active"
               readonly>
    </div>

    <div class="form-group">
        <input type="hidden"
               name="customer.customerId"
               value=${customerId}
               >
    </div>

    <div class="button-group">
        <input type="submit" value="Create Account" class="btn submit">
        <input type="reset" value="Reset" class="btn reset">
    </div>

</form>

<div class="home">
    <a href="${pageContext.request.contextPath}/">Back to Home</a>
</div>

</div>

</body>
</html>