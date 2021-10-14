import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int numberA = console.nextInt();
		int numberB = console.nextInt();
		
		System.out.println("X = " + (numberA + numberB));
	}
}