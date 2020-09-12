import java.util.Scanner;
import java.lang.Math;

public class Exerc2_30_SplitIntegers {

	public static void main(String[] args) {
		
		// Scanner declaration:
		Scanner input = new Scanner(System.in);
		
		// Variables declaration:
		int num;
		int tam;
		
		// Data Input:
		System.out.println("Enter Integer, please: ");
		num = input.nextInt();
		
		String num2 = Integer.toString(num);
		tam = num2.length();
		
		while (tam > 0) {
			System.out.printf("%d ", num / (int) (Math.pow(10, tam-1)));
			num = num % (int) (Math.pow(10, tam-1));
			tam--;
			
		}
						
	}
}
