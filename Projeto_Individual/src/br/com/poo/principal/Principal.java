package br.com.poo.principal;

import java.io.IOException;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.menu.MenuInterativo;


public class Principal {

	public static void main(String[] args) {
		try {
			LeituraEscrita.leitor("BD");
			MenuInterativo.menu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
