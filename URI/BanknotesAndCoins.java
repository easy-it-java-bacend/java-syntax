import java.util.Scanner;

public class BanknotesAndCoins {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double total = scan.nextDouble(); // 233.32
		
		int notas = (int) total; // 233
		int moedas = (int) (100 * (total - notas)); // 32
		
		System.out.println("NOTAS:");
		
		System.out.printf("%d nota(s) de R$ 100.00%n", notas / 100); // 2
		notas %= 100; // 33
		
		System.out.printf("%d nota(s) de R$ 50.00%n", notas / 50); // 0
		notas %= 50; // 33
		
		System.out.printf("%d nota(s) de R$ 20.00%n", notas / 20); // 1
		notas %= 20; // 13
		
		System.out.printf("%d nota(s) de R$ 10.00%n", notas / 10); // 1
		notas %= 10;// 3
		
		System.out.printf("%d nota(s) de R$ 5.00%n", notas / 5); // 0
		notas %= 5; // 3
		
		System.out.printf("%d nota(s) de R$ 2.00%n", notas / 2); // 1
		notas %= 2; // 1
		
		System.out.println("MOEDAS:");
		
		System.out.printf("%d moeda(s) de R$ 1.00%n", notas);
		
		System.out.printf("%d moeda(s) de R$ 0.50%n", moedas / 50);
		moedas %= 50;
		
		System.out.printf("%d moeda(s) de R$ 0.25%n", moedas / 25);
		moedas %= 25;
		
		System.out.printf("%d moeda(s) de R$ 0.10%n", moedas / 10);
		moedas %= 10;
		
		System.out.printf("%d moeda(s) de R$ 0.05%n", moedas / 5);
		moedas %= 5;
		
		System.out.printf("%d moeda(s) de R$ 0.01%n", moedas);
	
	}
}