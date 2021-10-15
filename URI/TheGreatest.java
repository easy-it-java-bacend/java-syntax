import java.util.Scanner;

public class TheGreatest {
	public static void main(String[] main) {
		Scanner scan = new Scanner(System.in);
		
		int max = scan.nextInt(); // 5
		int b = scan.nextInt(); // 22
		int c = scan.nextInt(); // 60
	
		max = (max + b + Math.abs(max - b)) / 2; // max = 22
		max = (max + c + Math.abs(max - c)) / 2; // max = 60
		
		System.out.printf("%d eh o maior%n", max);
	}
}