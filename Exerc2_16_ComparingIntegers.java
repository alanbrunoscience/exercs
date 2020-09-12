import java.util.Scanner;

public class Exerc2_16_ComparingIntegers {
	
	public static void main(String[] args) {
		
		// Initializing the Scanner Object:
		Scanner input = new Scanner (System.in);
		
		// Variables declaration:
		int a, b;
		
		// Data input: 
		System.out.print("Enter first integer: ");
		a = input.nextInt();
		
		System.out.print("Enter second integer: ");
		b = input.nextInt();
		
		// Making comparisons:
		if (a > b) {
			System.out.printf("%d is larger.", a);
		} else if (a == b){
			System.out.print("These numbers are equal.");
		}
		else {
			System.out.printf("%d is larger.", b);
		}
		
	}
	
}
