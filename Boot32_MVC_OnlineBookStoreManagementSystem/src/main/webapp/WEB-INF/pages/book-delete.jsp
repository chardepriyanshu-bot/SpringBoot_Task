<%@ page isELIgnored="false"%>

<h1>Book Delete</h1>

<form action="${pageContext.request.contextPath}/delete" method="post">

Enter Book Id:
<input type="number" name="bookId">

<input type="submit" value="Submit">

</form>
