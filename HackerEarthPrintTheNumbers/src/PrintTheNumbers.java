import java.util.Scanner;

public class PrintTheNumbers {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] agrs) 
	{
		int totalNum= s.nextInt();
		int arr[] = new int[totalNum];
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}
}
