import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Year: ");
		
		int year = scan.nextInt(); // 2020
		
		boolean isLeap = (year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0;
	
		System.our.println();
		// boolean ? true : false
	}
}