import java.util.Scanner;

public class CharSum {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] agrs) {
		String str = s.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			int character = str.charAt(i) - 'a' + 1;
			sum = sum + character;
		}
		System.out.println(sum);
	}
}
