import java.util.Scanner;

public class ArithmeticMean {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int counter = 0;
		
		while (true) {
			int number = scan.nextInt();
		
			if (number == 0) break;
			
			counter++;
			sum += number;
		}
		
		System.out.printf("Arithmetic mean is %.2f%n", (double) sum / counter);
	}
}