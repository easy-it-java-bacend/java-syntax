import java.util.Scanner;

public class DayOfMoth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Month: ");
		int month = scan.nextInt();
		
		if (month < 1 || month > 12) {
			System.out.println("Invalid month: " + month);
			System.exit(1); // Все правильно но данные не верны
		}
		
		System.out.print("Year: ");
		int year = scan.nextInt();
		
		int day; // мусор
		
		boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;
		
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
				
			case 2:
				day = isLeap ? 29 : 28;
				break;
		
			default:
				day = -1;
		}
		/*
		if (day == -1) {
			System.out.println("Invalid month: " + month);
		} else {
			System.out.println("Days: " + day);
		}
		*/
		System.out.println("Days: " + day);
	}
}