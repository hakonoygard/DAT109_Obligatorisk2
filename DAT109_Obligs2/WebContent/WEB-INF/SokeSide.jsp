<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aasøy bilutleiefirma</title>
</head>
<body>

      <form action ="SokeSide" method="post">
        <fieldset>
          <label for="Utleiested">Utleiested:</label> <input type="text" name="utleiested" id="fornavn" value="${skjema.fornavn}" />
          <span class="melding">${skjema.fornavnFeilmelding}</span>

          <label for="Retursted">Retursted:</label> <input type="text" name="retursted" id="etternavn" value="${skjema.etternavn}" />
          <span class="melding">${skjema.etternavnFeilmelding}</span>

          <label for="hentedato">Hentedato:</label> <input type="date" name="hentedato" id="mobil" value="${skjema.mobil}" />
          <span class="melding">${skjema.mobilFeilmelding}</span>

          <label for="antallDager">Antall dager:</label> <input type="text" name="antallDager" id="passord" value="${skjema.passord}" />
          <span class="melding">${skjema.passordFeilmelding}</span>

          <label for="hentetidspunkt">Hentetidspunkt:</label> <input type="time" name="hentetidspunkt" id="passordRepetert" value="${skjema.passordRepetert}" />
          <span class="melding">${skjema.passordRepetertFeilmelding}</span>

          <button type="submit">Hent alternativer</button>
        </fieldset>
      </form>

</body>
</html>