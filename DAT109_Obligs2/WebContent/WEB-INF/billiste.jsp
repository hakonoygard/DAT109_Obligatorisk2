<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


		<c:forEach var="d" items="${biler}">
		<tr>
			<td align="center"></td>
			<td>${d.merke}</td>
			<td>${d.modell}</td>
			<td>${d.farge}</td>
			<td>${d.regNr}</td>
			<td>${d.kmStand}</td>
			<td>${d.status}</td>
			<td>${d.gruppe}</td>
			
		</tr>
		</c:forEach>

</body>
</html>