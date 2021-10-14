import java.util.Scanner;

public class FahrToCel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int fahrenheit = scan.nextInt();
		int something = 32;
		
		double degreeInCelsius = (fahrenheit - (double)something) * 5 / 9;
		
		System.out.printf("%d fahrenheit = %.4f celsius%n", fahrenheit, degreeInCelsius);
	}
}