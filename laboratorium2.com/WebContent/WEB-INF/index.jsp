<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rejestracja</title>
</head>
<body>
	<form action="/laboratorium2.com/submitRegisterForm.html" method="post">
		<label for="imie">Imię: </label>
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
		<label for="plec">Płeć: </label>
		<br/>
		<input type="radio" id="mezczyzna" name="plec" value="mezczyzna"><label for="mezczyzna">Mężczyzna</label>
		<input type="radio" id="kobieta" name="plec" value="kobieta"><label for="kobieta">Kobieta</label>
		<br/>
		<label for="email">Email: </label>
		<br/>
		<input type="text" id="email" name="email">
		<br/>
		<label for="login">Login: </label>
		<br/>
		<input type="text" id="login" name="login">
		<br/>
		<label for="haslo">Hasło: </label>
		<br/>
		<input type="password" id="haslo" name="haslo">
		<br/>
		<label for="powthaslo">Powtórz hasło: </label>
		<br/>
		<input type="password" id="powthaslo" name="powthaslo">
		<br/><br/>
		<input type="submit" value="Zarejestruj">
	</form>
</body>
</html>