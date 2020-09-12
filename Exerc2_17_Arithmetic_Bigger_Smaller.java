import java.util.Scanner; 

public class Exerc2_17_Arithmetic_Bigger_Smaller {
	
	public static void main(String[] args) {
		
		// Initializing the Scanner Object:
		Scanner input = new Scanner (System.in);
		
		// Variables Declaration:
		int a, b, c, sum, average, prod, big, small;
		
		// Data Input:
		System.out.print("Enter first integer: ");
		a = input.nextInt();
		
		System.out.print("Enter second integer: ");
		b = input.nextInt();
		
		System.out.print("Enter third integer: ");
		c = input.nextInt();
		
		// Calculations (sum, average, product, biggest number and smallest number):
		
		sum = a + b + c;
		
		average = (a + b + c) / 3;
		
		prod = a * b * c;
		
		// The Biggest number:
		if (a > b && a > c) {
			big = a;
		}else if (b > a && b > c) {
			big = b;
		} else {
			big = c;
		}
		
		
		// The Smallest number:
		if (a < b && a < c) {
			small = a;
		} else if (b < a && b < c) {
			small = b;
		} else {
			small = c;
		}
		
		// Data Output:
		
		System.out.println("\n*** RESULTS ***");
		System.out.printf("-> %d + %d + %d = %d%n", a, b, c, sum);
		System.out.printf("-> (%d + %d + %d) / 3 = %d%n", a, b, c, average);
		System.out.printf("-> %d * %d * %d = %d%n", a, b, c, prod);
		System.out.printf("-> The biggest number is: %d%n", big);
		System.out.printf("-> The smallest number is: %d%n", small);
	}
	
	
}
