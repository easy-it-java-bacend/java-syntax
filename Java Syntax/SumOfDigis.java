import java.util.Scanner;

public class SumOfDigis {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Four digit number: "); //1234
		int number = scan.nextInt(); // 1 + 2 + 3 + 4 = 10
		
		System.out.print("Sum of digits of number " + number);
	
		int sum = 0;
		
		sum += number % 10;
		number /= 10;
		
		sum += number % 10;
		number /= 10;
		
		sum += number % 10;
		number /= 10;
		
		sum += number % 10;
		number /= 10; // 0
		
		System.out.println(" is " + sum);
	}
}