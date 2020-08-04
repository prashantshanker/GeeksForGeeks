import java.util.Scanner;

public class NumberOfSteps {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] agrs) {
		int count = 0;
		int sizeOfArray = s.nextInt();
		int[] arr1 = new int[sizeOfArray];
		int[] arr2 = new int[sizeOfArray];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = s.nextInt();
			min=Math.min(arr1[i], min);
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = s.nextInt();
		}
		count= NoOfSteps(arr1,arr2,min);
		System.out.println(count);
	}

	private static int NoOfSteps(int[] arr1, int[] arr2, int min) {
		int count=0;
		for(int i=0;i<arr1.length;i++) 
		{
			while(arr1[i]>min) 
			{
				if(arr1[i]>arr2[i]) 
				{
					arr1[i]=arr1[i]-arr2[i];
					count=count+1;
				}
				if(arr1[i]<min) 
				{
					return -1;
				}
			}
		}
		return count;
	}
}
