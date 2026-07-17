<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Information</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#eef2f7;
}

.container{
    width:90%;
    margin:40px auto;
}

h1{
    text-align:center;
    color:#0f172a;
    margin-bottom:25px;
}

.card{
    background:#fff;
    border-radius:12px;
    box-shadow:0 6px 18px rgba(0,0,0,.15);
    padding:25px;
}

table{
    width:100%;
    border-collapse:collapse;
    text-align:center;
}

th{
    background:#2563eb;
    color:white;
    padding:15px;
    font-size:16px;
}

td{
    padding:14px;
    border-bottom:1px solid #ddd;
}

tr:nth-child(even){
    background:#f8fafc;
}

tr:hover{
    background:#dbeafe;
    transition:.3s;
}

.status{
    color:green;
    font-weight:bold;
}

.empty{
    width:450px;
    margin:100px auto;
    background:white;
    padding:40px;
    text-align:center;
    border-radius:12px;
    box-shadow:0 6px 18px rgba(0,0,0,.15);
}

.empty h2{
    color:#dc2626;
    margin-bottom:15px;
}

.btn{
    display:inline-block;
    margin-top:20px;
    padding:12px 25px;
    background:#2563eb;
    color:white;
    text-decoration:none;
    border-radius:6px;
    transition:.3s;
}

.btn:hover{
    background:#1d4ed8;
}

</style>

</head>

<body>

<c:choose>

    <c:when test="${!empty acctList}">

        <div class="container">

            <h1>Account Information</h1>

            <div class="card">

                <table>

                    <tr>
                        <th>Account Number</th>
                        <th>Account Type</th>
                        <th>Balance</th>
                        <th>Branch</th>
                        <th>IFSC Code</th>
                        <th>Status</th>
                    </tr>

                    <c:forEach var="acc" items="${acctList}">

                        <tr>
                            <td>${acc.accountNumber}</td>
                            <td>${acc.accountType}</td>
                            <td>${acc.balance}</td>
                            <td>${acc.branch}</td>
                            <td>${acc.ifscCode}</td>
                            <td class="status">${acc.status}</td>
                        </tr>

                    </c:forEach>

                </table>

            </div>

        </div>

    </c:when>

    <c:otherwise>

        <div class="empty">
            <h2>No Account Found</h2>
            <p>There are no account records available.</p>

            <a href="/" class="btn">Go Home</a>
        </div>

    </c:otherwise>

</c:choose>

</body>
</html>