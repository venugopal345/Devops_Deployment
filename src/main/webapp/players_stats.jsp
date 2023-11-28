<%@page import="java.util.List"%>
<%@page import="Dto.TeamDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">

.a{
text-align: center;
position: relative;
left: 35%;
}
body{

background-color: silver;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List<TeamDto> lt=(List<TeamDto>) request.getAttribute("objects"); %>

<table class="a" border="" cellpadding="3px" cellspacing="3px">
<tr>
<th>Jersy Number</th>
<th>Player Name</th>
<th>Age</th>
<th>Matches</th>
<th>Role</th>
<th>BestScore</th>
</tr>

<%for(TeamDto l:lt){ %>
<tr>
<td><%=l.getJersyno() %></td>
<td><%=l.getName() %></td>
<td><%=l.getAge() %></td>
<td><%=l.getMatches() %></td>
<td><%=l.getRole() %></td>
<td><%=l.getBestscore() %></td>

</tr>

</<table>



<%} %>



</body>
</html>