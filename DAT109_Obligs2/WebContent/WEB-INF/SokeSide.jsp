<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aasøy bilutleiefirma</title>
</head>
<body>

	<form action="SokeSide" method="post">
		<fieldset>
			<label for="Hentested">Hentested</label>
			<c:forEach var="d" items="${utleiekontor}">
				<p>
					<input type="radio" name="hentested" value="${d.kontornummer}">${d.adresse.sted}</input>
				</p>
			</c:forEach>
			<label for="Retursted">Retursted</label>
			<c:forEach var="d" items="${utleiekontor}">
				<p>
					<input type="radio" name="retursted" value="${d.kontornummer}">${d.adresse.sted}</input>
				</p>
			</c:forEach>
			<label for="hentedato">Hentedato:</label> <input type="date"
				name="hentedato" /> <label for="antallDager">Antall dager:</label>
			<input type="text" name="antallDager" /> <label for="hentetidspunkt">Hentetidspunkt:</label>
			<input type="time" name="hentetidspunkt" />

			<button type="submit">Hent alternativer</button>
		</fieldset>
	</form>

</body>
</html>