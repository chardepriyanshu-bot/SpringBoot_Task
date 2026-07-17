<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Loans</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:linear-gradient(135deg,#0f2027,#203a43,#2c5364);
    padding:40px;
}

.container{
    width:95%;
    max-width:1300px;
    margin:auto;
    background:#fff;
    border-radius:12px;
    padding:30px;
    box-shadow:0 10px 25px rgba(0,0,0,.3);
}

h1{
    text-align:center;
    color:#0d6efd;
    margin-bottom:20px;
}

table{
    width:100%;
    border-collapse:collapse;
}

thead{
    background:#0d6efd;
    color:white;
}

th,td{
    padding:14px;
    text-align:center;
    border:1px solid #ddd;
}

tbody tr:nth-child(even){
    background:#f5f5f5;
}

tbody tr:hover{
    background:#dbeafe;
}

.status{
    color:green;
    font-weight:bold;
}

.btn{
    display:inline-block;
    margin-top:20px;
    padding:10px 20px;
    background:#0d6efd;
    color:white;
    text-decoration:none;
    border-radius:5px;
}

.btn:hover{
    background:#084298;
}

.message{
    text-align:center;
    color:red;
    font-size:24px;
    margin-top:30px;
}
</style>

</head>

<body>

<div class="container">

<c:choose>

<c:when test="${not empty loanList}">

<h1>Loan Details</h1>

<table>

<thead>
<tr>
    <th>Loan ID</th>
    <th>Customer ID</th>
    <th>Customer Name</th>
    <th>Loan Type</th>
    <th>Loan Amount</th>
    <th>Interest Rate (%)</th>
    <th>Status</th>
</tr>
</thead>

<tbody>

<c:forEach var="loan" items="${loanList}">

<tr>
    <td>${loan.loanId}</td>
    <td>${loan.customer.customerId}</td>
    <td>${loan.customer.customerName}</td>
    <td>${loan.loanType}</td>
    <td>${loan.loanAmount}</td>
    <td>${loan.interestRate}%</td>
    <td class="status">${loan.loanStatus}</td>
</tr>

</c:forEach>

</tbody>

</table>

</c:when>

<c:otherwise>

<div class="message">
    No Loan Records Found
</div>

</c:otherwise>

</c:choose>

<div style="text-align:center;">
    <a href="/" class="btn">Home</a>
</div>

</div>

</body>
</html>