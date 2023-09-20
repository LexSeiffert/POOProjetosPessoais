package br.com.poo.sb;



import java.text.DecimalFormat;
import java.util.logging.Level;
import br.com.poo.sb.contas.Conta;
import br.com.poo.util.Util;



public class SistemaInterno {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		Conta c1 = new Conta();
		c1.getTitular();
		c1.getSaldo();
		
		
		// Logger logger = Util.setupLogger();
		Util.customizer();
		Util.setupLogger().log(Level.INFO,() -> "Titular: " + c1.getTitular() 
						+ "\nSaldo: " + df.format(c1.getSaldo()));
	}
	

}
  