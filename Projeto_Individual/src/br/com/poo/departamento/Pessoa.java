package br.com.poo.departamento;

import java.util.HashMap;
import java.util.Map;

public class Pessoa {

	private Integer id;
	private String nome;
	private Integer idPessoa;
	
	public static Map<Integer, Pessoa> mapaPessoa = new HashMap<>();
	
	public Pessoa() {
		super();
	}

	public Pessoa(Integer id, String nome, Integer idPessoa) {
		super();
		this.id = id;
		this.nome = nome;
		this.idPessoa = idPessoa;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdCargo() {
		return idPessoa;
	}
	
}
