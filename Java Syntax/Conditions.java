import java.util.Scanner;

public class Conditions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String first = scan.nextLine();
		//String second = scan.nextLine();
		//String third = scan.nextLine();
		
		if (first.equals("vertabrado")) {
			System.out.println("1st");
		} else if (first.equals("invertabrado")) {
			System.out.println("2nd");
		}
	}
}