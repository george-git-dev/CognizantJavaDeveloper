package estruturasDeRepeti��oEArrays;

import java.util.Scanner;

/*
Fa�a um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

public class NomeEIdade {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// vari�veis
		String nome; // armazena o nome
		int idade; // armazena a idade

		while (true) { // Enquanto o loop for verdadeiro
			System.out.print("Nome: "); // Pede o nome
			nome = entrada.next(); // armazene esse nome na vari�vel

			if (nome.equals("0")) { // caso o nome igual a "0"
				break; // interrompa o programa

			}

			System.out.print("Idade: "); // Pede a idade
			idade = entrada.nextInt(); // armazena a idade na vari�vel

			// imprime o nome e a idade
			System.out.println("Nome: " + nome + ", idade: " + idade);
		}
		System.out.println("\nPROGRAMA FINALIZADO !!!");
		entrada.close();
	}
}