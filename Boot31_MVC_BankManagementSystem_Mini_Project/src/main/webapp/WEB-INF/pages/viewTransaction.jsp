<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transaction History</title>

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
    max-width:1350px;
    margin:auto;
    background:#fff;
    padding:30px;
    border-radius:12px;
    box-shadow:0 10px 25px rgba(0,0,0,.3);
}

h1{
    text-align:center;
    color:#0d6efd;
    margin-bottom:25px;
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
    border:1px solid #ddd;
    padding:14px;
    text-align:center;
}

tbody tr:nth-child(even){
    background:#f5f5f5;
}

tbody tr:hover{
    background:#dbeafe;
    transition:.3s;
}

.deposit{
    color:green;
    font-weight:bold;
}

.withdraw{
    color:red;
    font-weight:bold;
}

.transfer{
    color:#ff9800;
    font-weight:bold;
}

.btn{
    display:inline-block;
    margin-top:25px;
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

<c:when test="${not empty transactionList}">

<h1>Transaction History</h1>

<table>

<thead>
<tr>
    <th>Transaction ID</th>
    <th>Account Number</th>
    <th>Transaction Type</th>
    <th>Amount</th>
    <th>Remarks</th>
    <th>Transaction Date</th>
</tr>
</thead>

<tbody>

<c:forEach var="txn" items="${transactionList}">

<tr>

<td>${txn.transactionId}</td>

<td>${txn.account.accountNumber}</td>

<td>
    <c:choose>
        <c:when test="${txn.transactionType=='Deposit'}">
            <span class="deposit">${txn.transactionType}</span>
        </c:when>

        <c:when test="${txn.transactionType=='Withdraw'}">
            <span class="withdraw">${txn.transactionType}</span>
        </c:when>

        <c:otherwise>
            <span class="transfer">${txn.transactionType}</span>
        </c:otherwise>
    </c:choose>
</td>

<td>${txn.amount}</td>

<td>${txn.remarks}</td>

<td>${txn.transactionDate}</td>

</tr>

</c:forEach>

</tbody>

</table>

</c:when>

<c:otherwise>

<div class="message">
    No Transactions Found
</div>

</c:otherwise>

</c:choose>

<div style="text-align:center">
    <a href="/" class="btn">Home</a>
</div>

</div>

</body>
</html>