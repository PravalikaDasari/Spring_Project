<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" >
    <title>Document</title>
</head>
<body>
	
	<p><h1>LOGIN FORM</h1></p>
	
   <form:form method="POST" action="/SpringMvc/loginForm" modelAttribute="login" >
 			<table>
 				<tr>
        			<td>RefId</td>
        			<td><form:input type="text" path="refId"></form:input></td>
        		</tr>
        		<tr>
        			<td>name</td>
        			<td><form:input type="text" path="name"></form:input></td>
        		</tr>
        		<tr>
        			<td>gender</td>
        			<td><form:input type="text" path="gender"></form:input></td>
        		</tr>
        		<tr>
        			<td colspan=2><input type="submit" value="Save"> </td>
        		</tr>
 			</table>
 		</form:form>
</body>
</html>