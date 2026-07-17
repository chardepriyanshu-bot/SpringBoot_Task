<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Details</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Segoe UI, Tahoma, Geneva, Verdana, sans-serif;
}

body{
    background:linear-gradient(135deg,#4facfe,#00f2fe);
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    padding:40px;
}

.container{
    width:95%;
    max-width:1200px;
    background:#fff;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,.2);
    padding:30px;
}

h1{
    text-align:center;
    color:#0d6efd;
    margin-bottom:20px;
}

.count{
    text-align:right;
    font-size:18px;
    font-weight:bold;
    color:#198754;
    margin-bottom:15px;
}

table{
    width:100%;
    border-collapse:collapse;
    overflow:hidden;
    border-radius:10px;
}

thead{
    background:#0d6efd;
    color:white;
}

th{
    padding:15px;
    text-align:center;
    font-size:17px;
}

td{
    padding:14px;
    text-align:center;
    border-bottom:1px solid #ddd;
}

tbody tr:nth-child(even){
    background:#f8f9fa;
}

tbody tr:hover{
    background:#dbeafe;
    transition:.3s;
}

.btn{
    display:inline-block;
    margin-top:25px;
    padding:12px 25px;
    background:#0d6efd;
    color:white;
    text-decoration:none;
    border-radius:6px;
    font-weight:bold;
    transition:.3s;
}

.btn:hover{
    background:#084298;
}

.notfound{
    text-align:center;
    color:red;
    font-size:28px;
    padding:40px;
}

.footer{
    margin-top:20px;
    text-align:center;
}

@media(max-width:768px){

table{
    font-size:13px;
}

th,td{
    padding:8px;
}

}
</style>

</head>

<body>

<div class="container">

<c:choose>

<c:when test="${not empty custList}">

<h1>Customer Information</h1>

<div class="count">
    Total Customers : ${custList.size()}
</div>

<table>

<thead>
<tr>
    <th>Customer ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Address</th>
    <th>Mobile</th>
    <th>Aadhar Number</th>
</tr>
</thead>

<tbody>

<c:forEach var="cust" items="${custList}">

<tr>
    <td>${cust.customerId}</td>
    <td>${cust.customerName}</td>
    <td>${cust.email}</td>
    <td>${cust.address}</td>
    <td>${cust.mobile}</td>
    <td>${cust.aadharNumber}</td>
</tr>

</c:forEach>

</tbody>

</table>

<div class="footer">
   <a href="${pageContext.request.contextPath}/" class="btn">Home</a>
</div>

</c:when>

<c:otherwise>

<div class="notfound">
    No Customer Records Found
    <br><br>
    <a href="${pageContext.request.contextPath}/" class="btn">Home</a>
</div>

</c:otherwise>

</c:choose>

</div>

</body>
</html>