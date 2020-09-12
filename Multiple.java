import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		
		// Scanner declaration:
		Scanner input = new Scanner(System.in);
		
		// Variables declaration:
		int n1, n2;
		
		// Input Data:
		System.out.print("Enter first integer: ");
		n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		n2 = input.nextInt();
		
		// Verifying if n1 is multiple of n2:
		if (n1 % n2 == 0) {
			System.out.printf("%d is multiple of %d", n1, n2);
		} else {
			System.out.printf("%d is not multiple of %d", n1, n2);
		}
		
	}
	
}
