package br.com.poo.menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.departamento.Cargo;
import br.com.poo.departamento.Pessoa;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.util.Util;

public class MenuInterativo {

	static Scanner sc = new Scanner(System.in);
	private static Logger customlogger = Util.setupLogger();

	public static void menu() throws IOException {
		Util.customizer();
		customlogger.log(Level.INFO, () -> "Menu Interativo\n\n[1]\tListar cargos\n"
				+ "[2]\tListar pessoas\n[3]\tListar pessoa de cada cargo\n[0]\tSair" + "\n\nDigite a opção desejada:");

		int opc = sc.nextInt();

		switch (opc) {
		case 1:
			Util.customizer();
			customlogger.log(Level.INFO, () -> "\n\nLista de cargos:\n ");
			for (Cargo c : Cargo.mapaCargo.values()) {
				Util.customizer();
				customlogger.log(Level.INFO, () -> c.getNomeCargo());
			}
			Util.customizer();
			customlogger.log(Level.INFO, () -> "\n\n");
			menu();
			break;
		case 2:
			Util.customizer();
			customlogger.log(Level.INFO, () -> "\n\nLista de pessoas:\n ");
			for (Pessoa t : Pessoa.mapaPessoa.values()) {
				Util.customizer();
				customlogger.log(Level.INFO, () -> t.getNome());
			}
			Util.customizer();
			customlogger.log(Level.INFO, () -> "\n\n");
			menu();
			break;
		case 3:
			cargoPessoa();
			break;
		case 0:
			Util.customizer();
			customlogger.log(Level.INFO, () -> "Volte sempre!");
			break;
		default:
			Util.customizer();
			customlogger.log(Level.INFO, () -> "Opção inválida!");
			menu();
			break;
		}
	}

	public static void cargoPessoa() throws IOException {
		List<Pessoa> listaPessoa = new ArrayList<>();
		Cargo cargo = null;
		Util.customizer();
		customlogger.log(Level.INFO,
				() -> "\n\nCargos:\n[1]\tAnimação\n[2]\tColorização\n[3]\tCriação de Cenários\n[4]\tRoteiro\n[5]\tStoryboard\n[0]\tVoltar ao menu anterior\n\nDigite a opção desejada: ");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			cargo = Cargo.mapaCargo.get(1);
			listaPessoa.clear();
			for (Pessoa t : Pessoa.mapaPessoa.values()) {
				if (t.getIdCargo() == 1) {
					Util.customizer();
					customlogger.log(Level.INFO, () -> t.getNome());
					listaPessoa.add(t);
				}
			}
			LeituraEscrita.relatorioPessoasCargo(cargo, listaPessoa);
			cargoPessoa();
			break;
		case 2:
			cargo = Cargo.mapaCargo.get(2);
			listaPessoa.clear();
			for (Pessoa t : Pessoa.mapaPessoa.values()) {
				if (t.getIdCargo() == 2) {
					Util.customizer();
					customlogger.log(Level.INFO, () -> t.getNome());
					listaPessoa.add(t);
				}
			}
			LeituraEscrita.relatorioPessoasCargo(cargo, listaPessoa);
			cargoPessoa();
			break;
		case 3:
			cargo = Cargo.mapaCargo.get(3);
			listaPessoa.clear();
			for (Pessoa t : Pessoa.mapaPessoa.values()) {
				if (t.getIdCargo() == 3) {
					Util.customizer();
					customlogger.log(Level.INFO, () -> t.getNome());
					listaPessoa.add(t);
				}
			}
			LeituraEscrita.relatorioPessoasCargo(cargo, listaPessoa);
			cargoPessoa();
			break;
		case 4:
			cargo = Cargo.mapaCargo.get(4);
			listaPessoa.clear();
			for (Pessoa t : Pessoa.mapaPessoa.values()) {
				if (t.getIdCargo() == 4) {
					Util.customizer();
					customlogger.log(Level.INFO, () -> t.getNome());
					listaPessoa.add(t);
				}
			}
		case 5:
			cargo = Cargo.mapaCargo.get(5);
			listaPessoa.clear();
			for (Pessoa t : Pessoa.mapaPessoa.values()) {
				if (t.getIdCargo() == 5) {
					Util.customizer();
					customlogger.log(Level.INFO, () -> t.getNome());
					listaPessoa.add(t);
				}
			}
			LeituraEscrita.relatorioPessoasCargo(cargo, listaPessoa);
			cargoPessoa();
			break;
		case 0:
			menu();
			break;
		default:
			Util.customizer();
			customlogger.log(Level.INFO, () -> "Opção inválida!");
			cargoPessoa();
			break;
		}
	}
}