import java.util.Scanner;

public class BrickGame {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] agrs) {
		int n = s.nextInt();
		int sum = 0, temp, x;
		for (int i = 0;; i = i + 3) {
			sum += i;
			if (sum >= n) {
				temp = i;
				break;
			}
		}
		x = temp / 3;
		if ((sum - x * 2) < n && sum >= n) {
			System.out.println("Motu");
		} else {
			System.out.println("Patlu");
		}

	}
}
