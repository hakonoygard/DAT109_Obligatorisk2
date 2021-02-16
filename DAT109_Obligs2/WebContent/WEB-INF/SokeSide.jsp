<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aasøy bilutleiefirma</title>
</head>
<body>

	<p>FUNKER OGSÅ</p>

	<form action="SokeSide" method="post">
		<fieldset>
			<label for="Utleiested">Utleiested:</label> <input type="text"
				name="utleiested" /> <label for="Retursted">Retursted:</label> <input
				type="text" name="retursted" /> <label for="hentedato">Hentedato:</label>
			<input type="date" name="hentedato" /> <label for="antallDager">Antall
				dager:</label> <input type="text" name="antallDager" /> <label
				for="hentetidspunkt">Hentetidspunkt:</label> <input type="time"
				name="hentetidspunkt" />

			<button type="submit">Hent alternativer</button>
		</fieldset>
	</form>

</body>
</html>