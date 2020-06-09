import java.util.Scanner;

public class CostOfBalloon {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] agrs) {
		int testCase = s.nextInt();
		for (int i = 0; i < testCase; i++) {
			int ithCost = s.nextInt();
			int jthCost = s.nextInt();
			int numberOfParticipant = s.nextInt();
			int arr[][] = new int[numberOfParticipant][2];
			for (int j = 0; j < numberOfParticipant; j++) {
				for (int k = 0; k < 2; k++) {
					arr[j][k] = s.nextInt();
				}
			}
			if (i % 2 == 0) {
				printMinimumPrice(arr, ithCost, jthCost, numberOfParticipant);
			} else {
				printMinimumPrice(arr, jthCost, ithCost, numberOfParticipant);
			}
		}
	}

	private static void printMinimumPrice(int[][] arr, int ithCost, int jthCost, int numberOfParticipant) {
		int minimumPrice = 0;
		for (int j = 0; j < numberOfParticipant; j++) {
			for (int k = 0; k < 2; k++) {
				if (k == 0) {
					minimumPrice += (arr[j][k] * ithCost);
				} else {
					minimumPrice += (arr[j][k] * jthCost);
				}
			}
		}
		System.out.println(minimumPrice);
	}

}
