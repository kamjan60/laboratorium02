package com.laboratorium2.controllers;

import javax.validation.constraints.Size;

public class User {
	@Size(min=1, max=2)
	private String imie;
	
	private String nazwisko;
	private String stanowisko;
	private String plec;
	private String email;
	private String login;
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
