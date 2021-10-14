public class IncDec {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a++ == ++a); // 5 == 7 false
		System.out.println(a++ == a++); // 7 == 8 false
		System.out.println(++a == ++a); // 10 == 11 false
		System.out.println(++a == a++); // 12 == 12 true 
		// a = 13
		System.out.println("a = " + a);
		
	}
}