<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:choose>

    <c:when test="${not empty bookList}">

        <h1>Book Details</h1>

        <table border="1">
            <thead>
                <tr>
                    <th>Book Id</th>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Category</th>
                    <th>Price</th>
                    <th>Publisher</th>
                    <th>Publisher Date</th>
                    <th>Stock Quantity</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="book" items="${bookList}">
                    <tr>
                        <td>${book.bookId}</td>
                        <td>${book.title}</td>
                        <td>${book.author}</td>
                        <td>${book.category}</td>
                        <td>${book.price}</td>
                        <td>${book.publisher}</td>
                        <td>${book.publisher_date}</td>
                        <td>${book.stock_quantity}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </c:when>

    <c:otherwise>
        <h2>No Book Record Found</h2>
    </c:otherwise>

</c:choose>