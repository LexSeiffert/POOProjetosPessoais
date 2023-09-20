package br.com.poo.sb.contas;

import java.util.logging.Level;

import br.com.poo.util.Util;

public class Conta {
	
	private String numConta;
	private String titular;
	private double saldo;
	
	public Conta() {
	}
	
	public Conta(String numConta, String titular, double saldo) {
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else if(valor <= 0.0) {
			Util.customizer();
			Util.setupLogger().log(Level.INFO, () -> "Valor inválido!");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	
	public String getNumero() {
		return numConta;
	}
	
//	public void setNumero(String numConta) {
//		this.numConta = numConta;
//	} 
	
	public String getTitular() {
		return titular;
	}
	
//	public void setTitular(String titular) {
//		this.titular = titular;
//	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
}
