<%@ page isELIgnored="false"%>

<form action="register" method="post" style="border=1;">

	<h1 style="color:red;">Cricket Academy</h1>
	
	Enter Player Name: 
	<input type="text" name="playerName">
	Enter Team Name: 
	<input type="text" name="teamName">
	Enter Role: 
	<input type="text" name="role">
	Enter Batting Style: 
	<input type="text" name="battingStyle">
	Enter Jersey Number: 
	<input type="number" name="jerseyNumber">
	<br><br>
	<input type="submit" value="Submit">
	<input type="reset" value="Reset">
</form>


<a href="/register">Show</a>