package com.example.demo.model;

import java.util.Date;

public class Sondaggio {
	private int id;
	private String titolo;
	private Date data;
	private int creatore;
	private String descrizione;
	
	public Sondaggio(int id, String titolo, Date data, int creatore, String descrizione) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.data = data;
		this.creatore = creatore;
		this.descrizione = descrizione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getCreatore() {
		return creatore;
	}

	public void setCreatore(int creatore) {
		this.creatore = creatore;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
}
