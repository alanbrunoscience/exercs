// Programa de Adição que insere dois números, então exibe a soma deles.
import java.util.Scanner; // Programa utiliza a classe Scanner

public class Addition {
	
	// Método main inicia a execução do aplicativo Java
	public static void main(String [] args) {
		
		// Cria um Scanner para obter a entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1; // primeiro número a somar 
		int number2; // segundo número a somar
		int sum; // soma de number1 e number2
		
		System.out.println("Enter first integer: "); // prompt
		number1 = input.nextInt();
		
		System.out.println("Enter second integer: "); // prompt
		number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
		
		sum = number1 + number2; // soma os números, depois armazena o total em sum
		
		System.out.printf("Sum is %d%n", sum); // exibe a soma 
	} // fim do método main
} // fim da classe Adition
