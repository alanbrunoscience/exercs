import java.util.Scanner;

public class Exerc2_15_Arithmetic {
	
	public static void main(String[] args) {
		
		// Initializing the Scanner Object:
		Scanner input = new Scanner (System.in);
		
		// Variables declaration:
		int sum, prod, sub, quo, a, b;
		
		// Data Input:	
		System.out.print("Enter first integer: ");
		a = input.nextInt();
		
		System.out.print("Enter second integer: ");
		b = input.nextInt();
		
		// Calculating the sum:
		sum = a + b;
		
		// Calculating the product:
		prod = a * b;
		
		// Calculating the subtraction:
		sub = a - b;
		
		// Calculating the quotient:
		quo = a / b;
		
		// Data Output:
		System.out.print("*** RESULTS: ***");
		System.out.printf("-> %d + %d = %d%n", a, b, sum);
		System.out.printf("-> %d * %d = %d%n", a, b, sum);
		System.out.printf("-> %d - %d = %d%n", a, b, sum);
		System.out.printf("-> %d / %d = %d%n", a, b, sum);
	}
	
}
