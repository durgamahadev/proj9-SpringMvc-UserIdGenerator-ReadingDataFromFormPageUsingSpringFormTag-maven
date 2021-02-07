<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>

<div style="height: 600px; width: 900px; background-color: black;color: white;font-size: 20px;border: thin; ">
<h1><marquee scrollamount="50">FORM PAGE-0.3</marquee></h1>

<form:form action="processForm" modelAttribute="candidate" >
<table>
<tr>
<th>Name :</th>
<td><form:input path="name"/></td>
</tr>
<tr>
<th>Age :</th>
<td><form:input path="age"/></td>
</tr>
<tr>
<th> Gender :</th>
</tr>
<tr>
<th>Male :</th>
<td><form:radiobutton path="gender" value="Male"/><br></td>
<th>Female :</th>
<td><form:radiobutton path="gender" value="Female"/><br></td>
</tr>
<tr>
<th>Country :</th>
<td><form:select path="country">
              <form:options items="${candidate.listedCountry}"/>
          </form:select></td>
</tr>

<tr>
<table>
<tr>
<td><form:checkboxes items="${candidate.LANGUAGELIST}" path="languageList"/></td>
</tr>

</table>
</tr>

<tr>
<td><input type="submit" value="Submit" style="cursor: pointer;background-color:aqua; ;color: orange;font-size: medium; font-family: monospace;width: 180px; height: 50px" ></td>
<td><input type="reset" value="Reset" style="cursor: pointer;background-color:aqua; ;color: orange;font-size: medium; font-family: monospace;width: 180px; height: 50px" ></td>
<td><a href="home" style="cursor: pointer;background-color:aqua; ;color: orange;font-size: medium; font-family: monospace;max-width : 280px; max-height: 80px" >Back</a></td>
</tr>
</table> 
</form:form>
</div>
</body>
</html>