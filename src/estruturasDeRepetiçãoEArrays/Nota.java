package estruturasDeRepeti��oEArrays;

/*
Fa�a um programa que pe�a uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.
*/

import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // Abertura da entrada de fluxo de dados atrav�s do teclado

		System.out.println("Nota de 0 a 10: "); // Pe�a uma nota de 0 a 10
		int nota = entrada.nextInt(); // Entrada de dados, neste caso de um int

		while (nota < 0 | nota > 10) { // Enquanto o valor da nota for menor que 0 ou maior que 10.
			System.out.println("Nota Inv�lida!"); // Mensagem que o valor � inv�lido
			System.out.println("Tente novamente. Nota: "); // Pe�a novamente a nota
			nota = entrada.nextInt(); // Entrada de dados, neste caso de um int
		}

		System.out.println("Nota: " + nota); // imprimindo a nota v�lida
		
		System.out.println("\nPROGRAMA FINALIZADO !!!");


		entrada.close();
	}

}