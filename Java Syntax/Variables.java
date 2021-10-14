import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// типДанных название = значение;
		System.out.print("Fullname: ");
		String fullname = scan.nextLine();
		
		System.ouot.print("Age: ");
		int age = scan.nextInt();
		
		
		char gender = 'M';
		
		System.out.print("Is student: ");
		boolean isStudent = scan.nextBoolean();
		
		System.out.print("Inn: ");
		long inn = scan.nextLong();
		
		
	}
}