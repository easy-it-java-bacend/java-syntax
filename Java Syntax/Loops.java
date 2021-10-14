import java.util.*;

public class Loops {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int counter = 0;
		while (true) {
			int number = rnd.nextInt(100);
			if (number > 80 && number % 2 == 0) { 
				break;
			}
			else if (number > 80 && number % 2 != 0) {
				System.out.println(++counter + ". Closer...");
			}
			System.out.println(++counter + ". Still inside...");
		}
	}
}