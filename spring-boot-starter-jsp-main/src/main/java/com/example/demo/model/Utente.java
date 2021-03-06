package com.example.demo.model;

public class Utente {
	private int id;
	private String username;
	private String password;
	private String tipologia;
	
	public Utente(int id, String username, String password, String tipologia) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.tipologia = tipologia;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
}
