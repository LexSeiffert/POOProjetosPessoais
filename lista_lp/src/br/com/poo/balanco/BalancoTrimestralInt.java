package br.com.poo.balanco;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.util.Util;

public class BalancoTrimestralInt {

	private Integer gastosJaneiro = 15000;
	private Integer gastosFevereiro = 23000;
	private Integer gastosMarco = 17000;
	
	private Integer somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	private DecimalFormat df = new DecimalFormat("#,###.00");
	private Logger customLogger = Util.setupLogger();
	
	
	static final String TXT = "O balanço trimestral é de: R$ ";
	
	public int soma() {
		Util.customizer();
		customLogger.log(Level.INFO,() -> TXT + df.format(somaTotal));
		return somaTotal;
	}
	
	public int soma(int janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO,() -> TXT + df.format(janeiro));
		return janeiro;
	}
	
	public int soma(int janeiro, int fevereiro) {
		int somaBi = janeiro + fevereiro;
		Util.customizer();
		customLogger.log(Level.INFO,() -> TXT + df.format(somaBi));
		return somaBi;
	}
	
	public int soma(int janeiro, int fevereiro, int marco) {
		int somaTri = janeiro + fevereiro + marco;
		Util.customizer();
		customLogger.log(Level.INFO,() -> TXT + df.format(somaTri));
		return somaTri;
	}
}
    