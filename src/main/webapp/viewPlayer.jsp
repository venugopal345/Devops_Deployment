<%@page import="java.util.List"%>
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
<body>


<% List<TeamDto> lt=(List<TeamDto>) request.getAttribute("objects"); %>

<table class="a" border="" cellpadding="3px" cellspacing="3px">
<tr>
<th>Jersy Number</th>
<th>Player Name</th>
</tr>


<%for(TeamDto l:lt){ %>
<tr>
<td><%=l.getJersyno() %></td>
<td><%=l.getName() %></td>
<%} %>

</body>
</html>