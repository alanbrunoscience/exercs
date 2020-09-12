import java.util.Scanner;

public class Exerc2_24_BiggestAndSmallestIntegers {
	
	public static void main(String[] args) {
		
		// Scanner Declaration:
		Scanner input = new Scanner(System.in);
		
		// Variables declaration:
		int n1, n2, n3, n4, n5, biggest, smallest;
		
		// Input Data:
		System.out.print("Enter first integer: ");
		n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		n2 = input.nextInt();
		System.out.print("Enter third integer: ");
		n3 = input.nextInt();
		System.out.print("Enter fourth integer: ");
		n4 = input.nextInt();
		System.out.print("Enter fifth integer: ");
		n5 = input.nextInt();
		
		// Finding the biggest number:
		if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
			biggest = n1;
		} else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
			biggest = n2;
		} else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
			biggest = n3;
		} else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
			biggest = n4;
		} else {
			biggest = n5;
		}
		
		// Finding the smallest number:
		if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
			smallest = n1;
		} else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
			smallest = n2;
		} else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
			smallest = n3;
		} else if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
			smallest = n4;
		} else {
			smallest = n5;
		}
		
		// Output Data:
		System.out.println("\n*** RESULTS ***");
		System.out.printf("-> The Biggest Number is: %d%n", biggest);
		System.out.printf("-> The Smallest Number is: %d", smallest);
		
	}
	
}
