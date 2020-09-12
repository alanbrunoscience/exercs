import java.util.Scanner;

public class Exerc2_35_SolidaritySavingsCalculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Variables Declaration:
		double kmTotal, price, kmMid, parkingFee, tollPerDay, cost;
		
		// Input Data:
		System.out.println("Enter the quantity of total kilometers driven per day (Km):");
		kmTotal = input.nextDouble();
		
		System.out.println("Enter the price per liter of gasoline (R$):");
		price = input.nextDouble();
		
		System.out.println("Enter the quantity of middle kilometers per liter (Km):");
		kmMid = input.nextDouble();
		
		System.out.println("Enter the amount of parking fees per day (R$):");
		parkingFee = input.nextDouble();
		
		System.out.println("Enter the amount of toll per day (R$):");
		tollPerDay = input.nextDouble();
		
		// Calculating the daily cost to drive:
		cost = ((kmTotal/kmMid) * price) + parkingFee + tollPerDay;
		
		// Output Data:
		System.out.printf("The daily cost to drive is R$ %.2f", cost);
		
	}
	
}
