import java.util.Scanner;

public class Greatest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); // 5
		int b = scan.nextInt(); // 7
		int c = scan.nextInt(); // 8
	
		// (a + b + abs(a - b)) / 2 = greatest
		
		int max = (a + b + Math.abs(a - b)) / 2; // max = 7
		max = (c + max + Math.abs(c - max)) / 2; // maxTwo = 8
		
		System.out.println(max + " eh o maior");
	}
}