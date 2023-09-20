package br.com.poo.departamento;

import java.util.HashMap;
import java.util.Map;

public class Cargo {
	
	
	
	

	private Integer id;
	private String nomeCargo;
	
	public static Map<Integer, Cargo> mapaCargo = new HashMap<>();
	
	public Cargo() {
		super();
	}
	
	public Cargo(Integer id, String nomeCargo) {
		super();
		this.id = id;
		this.nomeCargo = nomeCargo;
	}

	public Integer getId() {
		return id;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}
	
}
