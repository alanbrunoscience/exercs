import java.util.Scanner;

public class Exerc2_32_NegativePositiveAndZeroValues {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		// Variables Declaration
		int i = 0, num, qtdPos = 0, qtdNeg = 0, qtdZ = 0;
		int vet[] = new int[5];
		
		while(i < 5) {
			System.out.println("Enter the " + (i+1) + "º integer:");
			vet[i] = input.nextInt();
			
			if(vet[i] == 0) {
				qtdZ++;
			} else if(vet[i] < 0) {
				qtdNeg++;
			} else {
				qtdPos++;
			}
			
			i++;
		}
		
		System.out.println("*** RESULTS ***");
		System.out.printf("-> Number of Negative: %d%n", qtdNeg);
		System.out.printf("-> Number of Zeros: %d%n", qtdZ);
		System.out.printf("-> Number of Positive: %d", qtdPos);	
		
	}
	
}
