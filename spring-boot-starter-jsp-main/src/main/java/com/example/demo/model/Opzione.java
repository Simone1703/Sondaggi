package com.example.demo.model;

public class Opzione {
	private int id;
	private String opzione;
	private int codDomanda;
	
	public Opzione(int id, String opzione, int codDomanda) {
		super();
		this.id = id;
		this.opzione = opzione;
		this.codDomanda = codDomanda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOpzione() {
		return opzione;
	}

	public void setOpzione(String opzione) {
		this.opzione = opzione;
	}

	public int getCodDomanda() {
		return codDomanda;
	}

	public void setCodDomanda(int codDomanda) {
		this.codDomanda = codDomanda;
	}
	
}
