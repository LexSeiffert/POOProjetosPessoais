package br.com.poo.sb.contas;

public class ContaCorrente extends Conta{
	
	private double chequeEspecial;
	//private boolean chequeEspecial;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String numConta, String titular, double saldo) {
		super(numConta, titular, saldo);
		this.chequeEspecial = chequeEspecial;
		}

	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	

}
