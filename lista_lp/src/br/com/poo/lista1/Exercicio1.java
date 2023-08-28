//pacote da aplicacao
package br.com.poo.lista1;

//lista de bibliotecas
import java.util.Scanner;

//funcao programa do portugol
public class Exercicio1 {

	// funcao inicio do portugol
	// funcao no portugol -> metodo no java
	public static void main(String[] args) {

		// declaracao de variaveis
		String nome;
		String sobrenome;

		// instancia
		Scanner sc = new Scanner(System.in);

		// funcao escreva do portugol
		System.out.println("Por favor, informe seu nome:");
		nome = sc.next();

		// utilizacao do laco for par "limpar" a tela
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}

		// funcao escreva do portugol
		System.out.println("Agora, informe seu sobrenome:");
		sobrenome = sc.next();

		// fecha o scanner
		sc.close();
		System.out.println("Seja bem-vindo(a) " + nome + " " + sobrenome + "!");

	}

		public static void limpa() {
			
		}
}
