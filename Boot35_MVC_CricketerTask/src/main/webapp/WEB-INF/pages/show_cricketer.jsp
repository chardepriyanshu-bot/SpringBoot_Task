<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:choose>
	
	<c:when test="${not empty cricketerList}">
	
	<h1>Cricketer List</h1>
	
	<table>
	
	<thead>
		
		<tr>
		
		<th>Player Id</th>
		<th>Player Name</th>
		<th>Player Team Name</th>
		<th>Player role</th>
		<th>Player Batting Style</th>
		<th>Player Jersey Number</th>
		
		</tr>
		
	</thead>
	
	<tbody>
	
	<c:forEach var="player" items="${cricketerList}">
	
		<tr>
			<td>${player.playerId}</td>
			<td>${player.playerName}</td>
			<td>${player.teamName}</td>
			<td>${player.role}</td>
			<td>${player.battingStyle}</td>
			<td>${player.jerseyNumber}</td>
		</tr>
	
	</c:forEach>
	
	</tbody>
	
	</table>
	
	</c:when>

</c:choose>