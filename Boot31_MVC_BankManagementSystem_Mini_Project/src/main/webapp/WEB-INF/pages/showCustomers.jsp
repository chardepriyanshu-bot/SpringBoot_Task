<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<br><br>

<c:choose>

<c:when test="${!empty custList}">
	
	<h1 style="text-align: center">Customer Information</h1>
	<table border="1" align="center" >
	<tr style="color:red">
	<th>Id</th>
	<th>Name</th>
	<th>email</th>
	<th>address</th>
	<th>phoneNumber</th>
	<th>Aadhar Number</th>
	</tr>
		<c:forEach var="cust" items="${custList}">
		<tr style="color:blue">
		<td>${cust.customerId}</td>
		<td>${cust.customerName}</td>
		<td>${cust.email}</td>
		<td>${cust.address}</td>
		<td>${cust.mobile}</td>
		<td>${cust.aadharNumber}</td>
	</tr>
		</c:forEach>
	
	</table>
</c:when>

<c:otherwise>
	<h1>Customer Not Found</h1>
</c:otherwise>

</c:choose>