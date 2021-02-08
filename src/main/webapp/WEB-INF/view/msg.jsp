<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<div style="height: 600px; width: 900px; background-color: black;color: white;font-size: 20px;border: thin; ">
<h1><marquee scrollamount="50">Welcome to MVC Result page-0.3</marquee></h1>
<table>
  <tr>
    <th>Name :</th>
    <th> ${candidate.name}</th>
  </tr>
  <tr>
    <th>Age :</th>
    <th> ${candidate.age}</th>
  </tr>
  <tr>
    <th>Gender :</th>
    <th> ${candidate.gender}</th>
  </tr>
  <tr>
    <th>Country :</th>
    <th> ${candidate.country}</th>
  </tr>
  
  <tr>
    <th>UserId:</th>
    <th> ${candidate.userId}</th>
  </tr>
  
  <tr>
  <th>Languages :</th>
  <td>
  <ul>
  		<c:forEach var="languages" items="${candidate.languageList}">
		  <li>
		  ${languages}
		   </li>  
		</c:forEach>
  </ul>
  
  
  </td>
  </tr>
  
  
<tr>
<th><a href="${pageContext.request.contextPath}/" style="background-color:white;font-size: large;">Home Page</a></th>
<th><a href="${pageContext.request.contextPath}/form" style="background-color:white;font-size: large;">Form Page</a></th>

</tr>

</table>

</div>
</body>
</html>