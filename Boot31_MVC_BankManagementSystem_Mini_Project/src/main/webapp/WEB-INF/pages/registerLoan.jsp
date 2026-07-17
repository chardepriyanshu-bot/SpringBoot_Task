<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loan Registration</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:linear-gradient(135deg,#1e3c72,#2a5298);
    display:flex;
    justify-content:center;
    align-items:center;
    min-height:100vh;
}

.container{
    width:500px;
    background:#fff;
    padding:30px;
    border-radius:12px;
    box-shadow:0 8px 20px rgba(0,0,0,.3);
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

input,select{
    width:100%;
    padding:10px;
    border:1px solid #ccc;
    border-radius:6px;
    font-size:15px;
}

input:focus,select:focus{
    outline:none;
    border-color:#0d6efd;
}

.btn{
    width:100%;
    padding:12px;
    border:none;
    background:#0d6efd;
    color:white;
    font-size:16px;
    border-radius:6px;
    cursor:pointer;
    margin-top:10px;
}

.btn:hover{
    background:#084298;
}

.back{
    text-align:center;
    margin-top:15px;
}

.back a{
    text-decoration:none;
    color:#0d6efd;
    font-weight:bold;
}
</style>

</head>
<body>

<div class="container">

<h1>Loan Registration</h1>

<form action="registerLoan" method="post">

    <div class="form-group">
        <label>Select Customer</label>
        <select name="customer.customerId" required>
            <option value="">-- Select Customer --</option>

            <c:forEach var="cust" items="${custList}">
                <option value="${cust.customerId}">
                    ${cust.customerId} - ${cust.customerName}
                </option>
            </c:forEach>

        </select>
    </div>

    <div class="form-group">
        <label>Loan Type</label>
        <select name="loanType" required>
            <option value="">Select Loan</option>
            <option>Home Loan</option>
            <option>Personal Loan</option>
            <option>Car Loan</option>
            <option>Education Loan</option>
            <option>Business Loan</option>
            <option>Gold Loan</option>
        </select>
    </div>

    <div class="form-group">
        <label>Loan Amount</label>
        <input type="number" step="0.01" name="loanAmount"
               placeholder="Enter Loan Amount" required>
    </div>

    <div class="form-group">
        <label>Interest Rate (%)</label>
        <input type="number" step="0.01" name="interestRate"
               placeholder="Enter Interest Rate" required>
    </div>

    <button type="submit" class="btn">
        Register Loan
    </button>

</form>

<div class="back">
    <a href="/">Back to Home</a>
</div>

</div>

</body>
</html>