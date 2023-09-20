package br.com.poo.aula;

import java.math.BigDecimal;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		//declaracao da variavel int
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		//soma das variaveis
		int gastosTrimeste = gastosJaneiro + gastosFevereiro + gastosMarco;
		double gastosTrimeste1 = gastosJaneiro + gastosFevereiro + gastosMarco;
		BigDecimal gastosTrimeste2 = new BigDecimal (gastosJaneiro + gastosFevereiro + gastosMarco);

		//saida dos valores
		System.out.println("Integer: " + gastosTrimeste + "\nDouble: " + gastosTrimeste1 + "\nBigDecimal: " + gastosTrimeste2);
	}

}