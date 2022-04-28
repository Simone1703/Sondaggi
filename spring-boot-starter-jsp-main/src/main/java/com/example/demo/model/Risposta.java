package com.example.demo.model;

import java.util.Date;

public class Risposta {
	private int id;
	private Date data;
	private int codOpzione;
	private int autore;
	
	public Risposta(int id, Date data, int codOpzione, int autore) {
		super();
		this.id = id;
		this.data = data;
		this.codOpzione = codOpzione;
		this.autore = autore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getCodOpzione() {
		return codOpzione;
	}

	public void setCodOpzione(int codOpzione) {
		this.codOpzione = codOpzione;
	}

	public int getAutore() {
		return autore;
	}

	public void setAutore(int autore) {
		this.autore = autore;
	}
	
}
