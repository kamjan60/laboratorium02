package com.laboratorium2.controllers;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class User {

	
	@Pattern(regexp="[^0-9]*", message="Imi� nie mo�e zawiera� liczby!")
	@Size(min=1, message="Nie mo�e by� puste!")

	private String imie;
	
	
	@Pattern(regexp="[^0-9]*", message="Nazwisko nie mo�e zawiera� liczby!")
	@Size(min=1, message="Nie mo�e by� puste!")

	private String nazwisko;
	
	@Size(min=1, message="Nie mo�e by� puste!")

	private String stanowisko;
	
	@Size(min=1, message="Nie mo�e by� puste!")

	private String plec;
	
	@Pattern(regexp="[\\S]*@[\\S]*[.][\\S]*", message="Email musi zawiera� znak @ oraz . za� zar�wno przed nimi i po nich musza wyst�powa� znaki.")
	@Size(min=1, message="Nie mo�e by� puste!")

	private String email;
	
	@Size(min=5, message="Nie mo�e by� kr�tszy ni� 5 znak�w!")

	private String login;
	
	@Size(min=6, message="Nie mo�e by� kr�tszy ni� 6 znak�w!")

	private String haslo;
	
	private String powthaslo;
	

	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getStanowisko() {
		return stanowisko;
	}
	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}
	public String getPlec() {
		return plec;
	}
	public void setPlec(String plec) {
		this.plec = plec;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getHaslo() {
		return haslo;
	}
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
	public String getPowthaslo() {
		return powthaslo;
	}
	public void setPowthaslo(String powthaslo) {
		this.powthaslo = powthaslo;
	}
	
}
