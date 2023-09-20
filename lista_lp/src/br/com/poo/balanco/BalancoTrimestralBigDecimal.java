package br.com.poo.balanco;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralBigDecimal {
	
	private BigDecimal gastosJaneiro =  new BigDecimal(15000.00);
	private BigDecimal gastosFevereiro = new BigDecimal(23000.00);
	private BigDecimal gastosMarco = new BigDecimal(17000.00);
	
	private BigDecimal somaTotal = gastosJaneiro.add(gastosFevereiro.add(gastosMarco));	
	
	static final String TXT = "O balanço trimestral é de: R$ ";
	Logger logger = Util.setupLogger();
	
	public BigDecimal soma() {
		logger.log(Level.INFO, () -> TXT + somaTotal);
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal janeiro) {
		logger.log(Level.INFO, () -> TXT + somaTotal);	
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro) {
		BigDecimal somaBi = janeiro.add(fevereiro);
		logger.log(Level.INFO, () -> TXT + somaBi);
		return somaBi;
	}
	
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco) {
		BigDecimal somaTri = janeiro.add(fevereiro.add(marco));
		logger.log(Level.INFO, () -> TXT + somaTri);
		return somaTri;
	}
	
}
