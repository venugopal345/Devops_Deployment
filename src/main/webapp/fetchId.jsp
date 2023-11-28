<%@page import="Dto.TeamDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.a{
text-align: center;
position: relative;

left: 40%;
top: 20%
}
body{

background-color: silver;
}
</style>
</head>
<body class="body">


<%TeamDto id= (TeamDto) request.getAttribute("id"); %>

<table class="a" border="" cellpadding="3px" cellspacing="3px">
<tr>
<th>Jersy Number</th>
<td><%=id.getJersyno() %></td>
</tr>
<tr>
<th>Player name</th>
<td><%=id.getName() %></td>
</tr>
<tr>
<th>Age</th>
<td><%=id.getAge() %></td>
</tr>
<tr>
<th>Matches</th>
<td><%=id.getMatches() %></td>
</tr>
<tr>
<th>Role</th>
<td><%=id.getRole() %></td>
</tr>
<tr>
<th>BestScore</th>
<td><%=id.getBestscore() %></td>
</tr>

</body>
</html>