<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rejestracja</title>
</head>
<body>
	<h1>${errorPassMatchMsg}</h1>
	<form action="/com.laboratorium2/submitRegisterForm.html" method="post">
		<label for="imie">Imię: </label>
		<br/>
		<input type="text" id="imie" name="imie"> <form:errors path="user.imie"/>
		<br/>
		<label for="nazwisko">Nazwisko: </label>
		<br/>
		<input type="text" id="nazwisko" name="nazwisko"> <form:errors path="user.nazwisko"/>
		<br/>
		<label for="stanowisko">Stanowisko: </label>
		<br/>
		<input type="text" id="stanowisko" name="stanowisko"> <form:errors path="user.stanowisko"/>
		<br/>
		<label for="plec">Płeć: </label>
		<br/>
		<input type="radio" id="mezczyzna" name="plec" value="Mężczyzna"><label for="mezczyzna">Mężczyzna</label> <form:errors path="user.plec"/>
		<input type="radio" id="kobieta" name="plec" value="Kobieta"><label for="kobieta">Kobieta</label>
		<br/>
		<label for="email">Email: </label>
		<br/>
		<input type="text" id="email" name="email"> <form:errors path="user.email"/>
		<br/>
		<label for="login">Login: </label>
		<br/>
		<input type="text" id="login" name="login"> <form:errors path="user.login"/>
		<br/>
		<label for="haslo">Hasło: </label>
		<br/>
		<input type="password" id="haslo" name="haslo"> <form:errors path="user.haslo"/>
		<br/>
		<label for="powthaslo">Powtórz hasło: </label>
		<br/>
		<input type="password" id="powthaslo" name="powthaslo"> <form:errors path="user.powthaslo"/>
		<br/><br/>
		<input type="submit" value="Zarejestruj">
	</form>
</body>
</html>