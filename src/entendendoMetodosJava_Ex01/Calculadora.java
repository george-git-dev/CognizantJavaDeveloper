package entendendoMetodosJava_Ex01;

/**
 * Classe de exemplo para o exerc�cio da Aula 1 de M�todos.
 */
public class Calculadora {
	
	
	
	/* M�todo soma */
	public static void soma(double n1, double n2) {

		double resultado = n1 + n2;

		System.out.println("A soma de " + n1 + " mais " + n2 + " � " + resultado);
	}
	
	
	/* M�todo subtracao */
	public static void subtracao(double n1, double n2) {

		double resultado = n1 - n2;

		System.out.println("A subtracao de " + n1 + " menos " + n2 + " � " + resultado);
	}
	
	
	/* M�todo multiplicacao */
	public static void multiplicacao(double n1, double n2) {

		double resultado = n1 * n2;

		System.out.println("A multiplica��o de " + n1 + " vezes " + n2 + " � " + resultado);
	}
	
	
	/* M�todo divisao */
	public static void divisao(double n1, double n2) {

		double resultado = n1 / n2;

		System.out.println("A divis�o de " + n1 + " por " + n2 + " � " + resultado);
	}

}
