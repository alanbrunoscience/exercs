import java.lang.Math;
import java.util.Scanner;

public class Exerc2_28_DiameterCircumferenceAndRadius {
	
	public static void main(String[] args) {
		
		// Scanner declaration:
		Scanner input = new Scanner(System.in);
		
		// Variables declaration:
		double radius, diameter, circumference, area;
		
		// Data Input:
		System.out.print("Enter radius, please: ");
		radius = input.nextDouble();
		
		// Calculating diameter, circumference and area;
		
		diameter = 2*radius;
		circumference = 2 * Math.PI * radius;
		area = Math.PI * Math.pow(radius, 2);
		
		// Data Output:
		System.out.println("\n*** RESULTS ***");
		System.out.printf("-> Diameter = %.2f%n", diameter);
		System.out.printf("-> Circumference = %.2f%n", circumference);
		System.out.printf("-> Area = %.2f", area);
	}
	
	
	
}
