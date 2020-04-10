package com.laboratorium2.controllers;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	@Pattern(regexp="[^0-9]*")
	@Size(min=1)
	private String imie;
	
	
	@Pattern(regexp="[^0-9]*")
	@Size(min=1)
	private String nazwisko;
	
	@Size(min=1)
	private String stanowisko;
	
	@Size(min=1)
	private String plec;
	
	@Pattern(regexp="[\\S]*@[\\S]*[.][\\S]*")
	@Size(min=1)
	private String email;
	
	@Size(min=5)
	private String login;
	
	@Size(min=6)
	private String haslo;
	
	@Size(min=1)
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
