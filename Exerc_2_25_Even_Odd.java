import java.util.Scanner;

public class Exerc_2_25_Even_Odd {
	
	public static void main(String[] args) {
		
		// Scanner declaration:
		Scanner input = new Scanner (System.in);
		
		// Variables declaration:
		int num;
		
		// Data Output:
		System.out.print("Enter first Integer: ");
		num = input.nextInt();
		
		// Validation if the number is even or odd:
		if (num % 2 == 0) {
			System.out.println("The number is even!");
		} else {
			System.out.println("The number is odd!");
		}
		
	}

}
