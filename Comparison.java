// Figura 2.15: Comparison.java
// Compara inteiros utilizando instru��es if, operadores relacionais
// e operadores de igualdade
import java.util.Scanner; // programa utiliza a classe Scanner

public class Comparison {
	
	// m�todo main incia a execu��o do aplicativo Java
	public static void main (String[] args) {
		// cria Scanner para obter a entrada do usu�rio a partir da linha de comando
		Scanner input = new Scanner(System.in);
		
		int number1; // primeiro n�mero a comparar
		int number2; // segundo n�mero a comparar
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // l� o primeiro n�mero fornecido pelo usu�rio
		
		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // l� o segundo n�mero fornecido pelo usu�rio
		
		if (number1 == number2) {
			System.out.printf("%d == %d%n", number1, number2);
		}
		
		if (number1 != number2) {
			System.out.printf("%d != %d%n", number1, number2);
		}
		
		if (number1 < number2) {
			System.out.printf("%d < %d%n", number1, number2);
		}
		
		if (number1 > number2) {
			System.out.printf("%d > %d%n", number1, number2);
		}
		
		if (number1 <= number2) {
			System.out.printf("%d <= %d%n", number1, number2);
		}
		
		if (number1 >= number2) {
			System.out.printf("%d >= %d%n", number1, number2);
		}
	} // fim do m�todo main
} // fim da Classe Comparison
