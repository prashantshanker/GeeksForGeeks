import java.util.Scanner;

public class PiizzaCutting {
	public static void main(String[] agrs) {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		long arr[] = new long[testCase];
		for (int i = 0; i < testCase; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < testCase; i++) {
			System.out.println(slices(arr[i]));
		}
	}

	private static long slices(long n) {
		long noOfSlices = 1 + (n * (n + 1)) / 2;
		return noOfSlices;
	}
}
