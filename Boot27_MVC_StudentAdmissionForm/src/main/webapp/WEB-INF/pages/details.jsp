<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Details</title>
</head>
<body>

    <h1 align="center">Student Details</h1>

    <table border="1" align="center" cellpadding="10">
        <tr>
            <th>Student ID</th>
            <td>${student.id}</td>
        </tr>
        <tr>
            <th>Student Name</th>
            <td>${student.name}</td>
        </tr>
        <tr>
            <th>Course</th>
            <td>${student.course}</td>
        </tr>
        <tr>
            <th>Phone Number</th>
            <td>${student.phoneNumber}</td>
        </tr>
    </table>

    <br>

    <div align="center">
        <a href="data">Back to Form</a>
    </div>

</body>
</html>