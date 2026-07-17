<%@ page isELIgnored="false"%>

<h1 style="color:red;">Book Update</h1>

<form action="${pageContext.request.contextPath}/update" method="post" style="border: 1;">

	Enter Book Id: 
	<input type="number" name="bookId"><br>
	Enter Book title: 
	<input type="text" name="title"><br>
	Enter Book author: 
	<input type="text" name="author"><br>
	Enter Book category: 
	<input type="text" name="category"><br>
	Enter Book price: 
	<input type="number" name="price"><br>
	Enter Book publisher: 
	<input type="text" name="publisher"><br>
	Enter Book publisher date: 
	<input type="date" name="publisher_date"><br>
	Enter Book stock quantity: 
	<input type="number" name="stock_quantity"><br>
	
	<input type="submit" value="Submit">
	<input type="reset" name="Reset">
	
</form>