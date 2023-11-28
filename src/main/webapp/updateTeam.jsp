<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="update" method="post">
	<table class="a" >
	<tr>
       <td > <label for="jersy" class="b">Enter Jersy Number:</label> </td>
       <td> <input type="number" id="jersy" name="jersy" required readonly="readonly" value="<%=request.getParameter("jersy")%>"></td><br><br>
	</tr>

	<tr>
       <td> <label for="name">Enter Name:</label></td>
       <td> <input type="text" id="name" name="name" required value="<%=request.getParameter("name")%>"> </td> <br><br>
	</tr>

	<tr>
       <td>  <label for="age">Enter Age:</label></td>
       <td> <input type="number" id="age" name="age" required value="<%=request.getParameter("age")%>"> </td><br><br>
    </tr>    
        
    <tr>
        <td>   <label for="matches">Enter Matches:</label></td>
       <td>  <input type="number" id="matches" name="matches" required value="<%=request.getParameter("matches")%>"></td><br><br>
    </tr>   
        
     <tr>
        <td>   <label for="role">Enter Role:</label></td>
       <td>  <input type="text" id="role" name="role" required value="<%=request.getParameter("role")%>"></td><br><br>
    </tr>    
        
    <tr>
       <td>    <label for="bestscore">Enter Bestscore:</label></td>
       <td>  <input type="number" id="bestscore" name="bestscore" required value="<%=request.getParameter("bestscore")%>"></td><br><br>
    </tr>    
  
   <tr>
        <td> <input type="submit" value="Submit"></td>
    </tr>  

</table>
</form>

</body>
</html>