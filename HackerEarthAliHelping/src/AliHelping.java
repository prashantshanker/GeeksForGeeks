import java.util.Scanner;

public class AliHelping {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.next();
		if ((((str.charAt(0) - '0') + (str.charAt(1) - '0')) % 2 == 0) &&

				(((str.charAt(3) - '0') + (str.charAt(4) - '0')) % 2 == 0) &&

				(((str.charAt(4) - '0') + (str.charAt(5) - '0')) % 2 == 0) &&

				(((str.charAt(7) - '0') + (str.charAt(8) - '0')) % 2 == 0) &&

				(str.charAt(2) != 'A') && (str.charAt(2) != 'E') && (str.charAt(2) != 'I') && (str.charAt(2) != 'O')
				&& (str.charAt(2) != 'U') && (str.charAt(2) != 'Y')) {

			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
}
