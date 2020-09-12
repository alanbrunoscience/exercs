import java.util.Scanner;

// Calculate the product of three integer:
public class ProductThreeInteger {
	public static void main(String[] args) {
		
		// Creating the Scanner method:
		Scanner input = new Scanner (System.in);
		
		// Variables declaration:
		int x, y, z, result;
		
		// Input data:
		System.out.printf("%s", "Enter first integer: ");
		x = input.nextInt();
		
		System.out.printf("%s", "Enter second integer: ");
		y = input.nextInt();
		
		System.out.printf("%s", "Enter third integer: ");
		z = input.nextInt();
		
		// Calculating the product of three integers:
		result = x * y * z;
		
		// Output:
		System.out.printf("%s%d%n", "Product is ", result);
		// System.out.printf("Product is %d%n", result);
		
	}

}
