import java.util.Scanner;

public class FindProduct 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		long arraySize=s.nextLong();
		long[] array=new long[(int) arraySize];
		long product=1;
		for(int i=0;i<array.length;i++) 
		{
			array[i]=s.nextInt();
		}
		for(int i=0;i<array.length;i++) 
		{
			product = (product*array[i]) % (1000000007);
		}
		System.out.println(product);
	}
}
