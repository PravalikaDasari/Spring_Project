
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <body>	
    	<div>
    		<p>
    			<h1><c:out value="${headername}" /></h1>
    		</p>
    	</div>
    	<div>
        	<table>
        		<tr>
        			<th>RefId</th>
        			<th>Name</th>
        			<th>Gender</th>
        		</tr>
        		<c:forEach items="${allRecords}" var="allRecords" >
		        			<tr>
			        			<td>${allRecords.refId}</td>
			        			<td>${allRecords.name}</td>
			        			<td>${allRecords.gender}</td>
			        		</tr>
        		</c:forEach>
        	</table>
        </div>
    </body>
</html>
