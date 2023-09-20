package br.com.poo.enums;

public enum DepartamentoEnum {

	PESSOA("Pessoa", 1),
	CARGO("Cargo", 2);

	private String tipo;
	private int id;
	
	DepartamentoEnum(String tipo, int id) {
		this.tipo = tipo;
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public int getId() {
		return id;
	}
	
}
