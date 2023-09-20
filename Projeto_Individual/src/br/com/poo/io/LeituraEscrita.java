package br.com.poo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.poo.departamento.Cargo;
import br.com.poo.departamento.Pessoa;
import br.com.poo.enums.DepartamentoEnum;

public class LeituraEscrita {

	static final String PATH_BASICO = ".\\temp\\";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");
				if (dados[0].equalsIgnoreCase(DepartamentoEnum.CARGO.getTipo())) {
					Cargo c = new Cargo(Integer.parseInt(dados[1]), dados[2]);
					Cargo.mapaCargo.put(Integer.parseInt(dados[1]), c);
				} else if (dados[0].equalsIgnoreCase(DepartamentoEnum.PESSOA.getTipo())) {
					Pessoa t = new Pessoa(Integer.parseInt(dados[1]), dados[2], Integer.parseInt(dados[3]));
					Pessoa.mapaPessoa.put(Integer.parseInt(dados[1]), t);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

	public static void relatorioPessoasCargo(Cargo Cargo, List<Pessoa> Pessoas) throws IOException {
		String nomeArquivo = Cargo.getNomeCargo();
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));
		buffWrite.append("*************** Relatório **************\n");
		buffWrite.append(Cargo.getNomeCargo() + ":\n\n");
		if(!Pessoas.isEmpty()) {
			for(Pessoa t : Pessoas) {
				buffWrite.append(" - " + t.getNome() + "\n");
			}
		} else {
			buffWrite.append("Não tem Pessoa para esse cargo!\n");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		buffWrite.append("\nData da programação: " + sdf.format(date) + "\n");
		buffWrite.append("************* Fim Relatório ************\n");
		buffWrite.close();
	}

}
