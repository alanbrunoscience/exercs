// Programa de Adi��o que insere dois n�meros, ent�o exibe a soma deles.
import java.util.Scanner; // Programa utiliza a classe Scanner

public class Addition {
	
	// M�todo main inicia a execu��o do aplicativo Java
	public static void main(String [] args) {
		
		// Cria um Scanner para obter a entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1; // primeiro n�mero a somar 
		int number2; // segundo n�mero a somar
		int sum; // soma de number1 e number2
		
		System.out.println("Enter first integer: "); // prompt
		number1 = input.nextInt();
		
		System.out.println("Enter second integer: "); // prompt
		number2 = input.nextInt(); // l� o segundo n�mero fornecido pelo usu�rio
		
		sum = number1 + number2; // soma os n�meros, depois armazena o total em sum
		
		System.out.printf("Sum is %d%n", sum); // exibe a soma 
	} // fim do m�todo main
} // fim da classe Adition
