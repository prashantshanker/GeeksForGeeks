import java.util.Scanner;

public class CountDivisors
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int l=s.nextInt();
		int r=s.nextInt();
		int k=s.nextInt();
		int countDivisor=0;
		for(int i=l;i<=r;i++) 
		{
			if(i%k==0) 
			{
				countDivisor++;
			}
		}
		System.out.println(countDivisor);
	}
}
