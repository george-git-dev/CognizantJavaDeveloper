package entendendoMetodosJava_Ex01;

/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public class Calculadora {
	
	
	
	/* Método soma */
	public static void soma(double n1, double n2) {

		double resultado = n1 + n2;

		System.out.println("A soma de " + n1 + " mais " + n2 + " é " + resultado);
	}
	
	
	/* Método subtracao */
	public static void subtracao(double n1, double n2) {

		double resultado = n1 - n2;

		System.out.println("A subtracao de " + n1 + " menos " + n2 + " é " + resultado);
	}
	
	
	/* Método multiplicacao */
	public static void multiplicacao(double n1, double n2) {

		double resultado = n1 * n2;

		System.out.println("A multiplicação de " + n1 + " vezes " + n2 + " é " + resultado);
	}
	
	
	/* Método divisao */
	public static void divisao(double n1, double n2) {

		double resultado = n1 / n2;

		System.out.println("A divisão de " + n1 + " por " + n2 + " é " + resultado);
	}

}
