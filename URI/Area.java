import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final double PI_NUMBER = 3.14159;
		
		double radius = scan.nextDouble();
		
		double answer = radius * radius * PI_NUMBER;
		
		System.out.printf("A=%.4f%n", answer);
	}
}
