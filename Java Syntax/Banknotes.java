import java.util.Scanner;

public class Banknotes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int money = scan.nextInt();
		
		System.out.println(money);
		
		System.out.printf("%d nota(s) de R$ 100,00", money % 100);
		money /= 100;
		
		System.out.printf("%d nota(s) de R$ 50,00", money % 50);
		money /= 50;
		
		System.out.printf("%d nota(s) de R$ 20,00", money % 20);
		money /= 20;
		
		System.out.printf("%d nota(s) de R$ 10,00", money % 10);
		money /= 10;
		
		System.out.printf("%d nota(s) de R$ 5,00", money % 5);
		money /= 5;
		
		System.out.printf("%d nota(s) de R$ 2,00", money % 2);
		money /= 2;
		
		System.out.printf("%d nota(s) de R$ 1,00", money);
	}
}