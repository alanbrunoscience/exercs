import java.util.Scanner;
import java.lang.Math;

public class Exerc2_34_WorldDemographicGrowth {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		// Variable declarations:
		double population, indexDem, calcWDG;
		int numberOfYears;
		
		// Input data:
		System.out.println("Enter the current world population:");
		population = input.nextDouble();
		System.out.println("Enter the index of World Demographic Growth (%):");
		indexDem = input.nextDouble();
		System.out.println("Enter the number of years to calculate the World Population Growth forecast:");
		numberOfYears = input.nextInt();
		
		// Calculating the World Demographic Growth:
		calcWDG = population * (Math.pow((1 + indexDem), numberOfYears));
		
		// Data Output:
		System.out.printf("The forecast of the World Population in %d years is %.0f", numberOfYears, calcWDG);
	}
	
}
