<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Admission Form</title>
</head>
<body>

    <h1 align="center">Student Admission Form</h1>

    <form action="register" method="post" align="center">

        Student ID :
        <input type="number" name="id" required>
        <br><br>

        Student Name :
        <input type="text" name="name" required>
        <br><br>

        Course :
        <input type="text" name="course" required>
        <br><br>

        Phone Number :
        <input type="text" name="phoneNumber" required>
        <br><br>

        <input type="submit" value="Register">

    </form>

</body>
</html>