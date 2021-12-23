package entendendoMetodosJava_Ex02;

/**
 * Classe de exemplo para o exercício da Aula 2 de Métodos.
 */
public class Quadrilatero {

	/* Método passando um parametro*/
	public static void area(double lado) {

		System.out.println("Área do quadrado:" + lado * lado);
	}
	
	
	/* Sobrecarga passando dois parâmetros*/
	public static void area(double lado1, double lado2) {

		System.out.println("Área do retângulo:" + lado1 * lado2);
	}
	
	
	/* Sobrecarga passando três parâmetros*/
	public static void area(double baseMaior, double baseMenor, double altura) {

		System.out.println("Área do trapézio:" + ((baseMaior + baseMenor) * altura) / 2);
	}

	
	/* Sobrecarga passando dois parâmetros com tipos diferentes*/
	public static void area(float diagonal1, float diagonal2) {

		System.out.println("Área do losango:" + (diagonal1 * diagonal2) / 2);
	}

}