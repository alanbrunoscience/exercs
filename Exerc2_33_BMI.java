import java.util.Scanner;
import java.lang.Math;

public class Exerc2_33_BMI {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Variable declarations:
		double weight, hight, bmi;
		
		System.out.println("*** BMI Calculator ***\n");
		System.out.println("Enter your weight (Kg):");
		weight = input.nextDouble();
		System.out.println("Enter your hight (m):");
		hight = input.nextDouble();
		
		// Calculating BMI:
		bmi = (weight)/(Math.pow(hight, 2));
		
		// Print Output:
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
		
		if(bmi < 18.5) {
			System.out.println("\nYou are Underweight!");
		} else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("\nYou are Normal!");
		} else if(bmi >= 25 && bmi < 29.9) {
			System.out.println("\nYou are Overweight!");
		} else {
			System.out.println("\nYou are Obese!");
		}
		
		
	}

}
