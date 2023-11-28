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
left: 34%;
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
<th>Age</th>
<th>Matches</th>
<th>Role</th>
<th>BestScore</th>
<th>Update Data</th>
<th>Delete</th>
</tr>

<%for(TeamDto l:lt){ %>
<tr>
<td><%=l.getJersyno() %></td>
<td><%=l.getName() %></td>
<td><%=l.getAge() %></td>
<td><%=l.getMatches() %></td>
<td><%=l.getRole() %></td>
<td><%=l.getBestscore() %></td>
<td> <a href="updateTeam.jsp?jersy=<%=l.getJersyno()%>&&name=<%=l.getName()%>&&age=<%=l.getAge()%>&&matches=<%=l.getMatches()%>&&role=<%=l.getRole()%>&&bestscore=<%=l.getBestscore()%>"> Edit </a> </td>
<td><a href="delete?jersy=<%=l.getJersyno()%>">Remove Data</a></td>
</tr>

</<table>



<%} %>

</body>
</html>