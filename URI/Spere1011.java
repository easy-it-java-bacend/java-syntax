import java.util.Scanner;

public class Spere1011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final double PI_NUMBER = 3.14159;
		
		int radius = scan.nextInt();
		
		double volume = (double) 4 / 3 * PI_NUMBER * Math.pow(radius, 3);
	
		System.out.printf("VOLUME = %.3f%n", volume);
	}
}