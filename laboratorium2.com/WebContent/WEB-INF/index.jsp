<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<label for="imie">Imie: </label>
		<br/>
		<input type="text" id="imie" name="imie">
		<br/>
		<label for="nazwisko">Nazwisko: </label>
		<br/>
		<input type="text" id="nazwisko" name="nazwisko">
		<br/>
		<label for="stanowisko">Stanowisko: </label>
		<br/>
		<input type="text" id="stanowisko" name="stanowisko">
		<br/>
		<label for="plec">Plec: </label>
		<br/>
		<input type="radio" id="mezczyzna" name="mezczyzna" value="mezczyzna">
		<input type="radio" id="kobieta" name="kobieta" value="kobieta">
		<br/>
		<label for="email">Email: </label>
		<br/>
		<input type="text" id="email" name="email">
		<br/>
		<label for="login">Login: </label>
		<br/>
		<input type="text" id="login" name="login">
		<br/>
		<label for="haslo">Haslo: </label>
		<br/>
		<input type="password" id="haslo" name="haslo">
		<br/>
		<label for="powthaslo">Powtorz haslo: </label>
		<br/>
		<input type="password" id="powthaslo" name="powthaslo">
		<br/>
		<input type="submit" value="Zarejestruj">
	</form>
</body>
</html>