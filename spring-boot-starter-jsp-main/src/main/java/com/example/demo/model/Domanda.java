package com.example.demo.model;

public class Domanda {
	private int id;
	private String domanda;
	private int numRisposte;
	private int codSondaggio;
	
	public Domanda(int id, String domanda, int numRisposte, int codSondaggio) {
		super();
		this.id = id;
		this.domanda = domanda;
		this.numRisposte = numRisposte;
		this.codSondaggio = codSondaggio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDomanda() {
		return domanda;
	}

	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	public int getNumRisposte() {
		return numRisposte;
	}

	public void setNumRisposte(int numRisposte) {
		this.numRisposte = numRisposte;
	}

	public int getCodSondaggio() {
		return codSondaggio;
	}

	public void setCodSondaggio(int codSondaggio) {
		this.codSondaggio = codSondaggio;
	}
	
}
