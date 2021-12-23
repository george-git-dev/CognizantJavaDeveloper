package entendendoMetodosJava_Ex02;

/**
 * Classe de exemplo para o exerc�cio da Aula 2 de M�todos.
 */
public class Quadrilatero {

	/* M�todo passando um parametro*/
	public static void area(double lado) {

		System.out.println("�rea do quadrado:" + lado * lado);
	}
	
	
	/* Sobrecarga passando dois par�metros*/
	public static void area(double lado1, double lado2) {

		System.out.println("�rea do ret�ngulo:" + lado1 * lado2);
	}
	
	
	/* Sobrecarga passando tr�s par�metros*/
	public static void area(double baseMaior, double baseMenor, double altura) {

		System.out.println("�rea do trap�zio:" + ((baseMaior + baseMenor) * altura) / 2);
	}

	
	/* Sobrecarga passando dois par�metros com tipos diferentes*/
	public static void area(float diagonal1, float diagonal2) {

		System.out.println("�rea do losango:" + (diagonal1 * diagonal2) / 2);
	}

}