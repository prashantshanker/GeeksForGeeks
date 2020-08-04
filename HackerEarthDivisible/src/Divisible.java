import java.util.Scanner;

public class Divisible {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] agrs) {
		int size = s.nextInt();
		int num = 0;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
			if (i < size / 2) {
				num = firstDigit(arr[i], num);
			} else {
				num = lastDigit(arr[i], num);
			}
		}
		if (num % 11 == 0) {
			System.out.println("OUI");
		} else {
			System.out.println("NON");
		}
	}

	private static int firstDigit(int i, int num) {
		while (i > 10) {
			i = i / 10;
		}
		num = num * 10 + i;
		return num;
	}

	private static int lastDigit(int i, int num) {
		i = i % 10;
		num = num * 10 + i;
		return num;
	}
}
