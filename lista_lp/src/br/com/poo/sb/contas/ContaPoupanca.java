package br.com.poo.sb.contas;

public class ContaPoupanca extends Conta{
	
	private double rendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String numConta, String titular, double saldo) {
		super(numConta, titular, saldo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}
	
	
	
}
