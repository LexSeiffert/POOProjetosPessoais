package br.com.poo.balanco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralDouble {

	private Double gastosJaneiro = 15000.00;
	private Double gastosFevereiro = 23000.00;
	private Double gastosMarco = 17000.00;
	
	public Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	
	static final String TXT = "O balanço trimestral é de: R$ ";
	Logger logger = Util.setupLogger();
	
	public double soma() {
		logger.log(Level.INFO, () -> TXT + somaTotal);
		return somaTotal;
	}
	
	public double soma(double janeiro) {
		logger.log(Level.INFO, () -> TXT + janeiro);
		return janeiro;
	}
	
	public double soma(double janeiro, double fevereiro) {
		Double somaBi = janeiro + fevereiro;
		somaTotal = janeiro;
		logger.log(Level.INFO, () -> TXT + somaBi);
		return somaBi;
	}
	
	public double soma(double janeiro, double fevereiro, double marco) {
		Double somaTri = janeiro + fevereiro + marco;
		logger.log(Level.INFO, () -> TXT + somaTri);
		return somaTri;
	}	
}

