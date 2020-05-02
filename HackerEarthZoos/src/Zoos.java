import java.util.Scanner;

public class Zoos {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] agrs) 
	{
		String zoo=s.next();
		int countZ=0;
		int countO=0;
		for(int i=0;i<zoo.length();i++) 
		{
			if(zoo.charAt(i)=='z' || zoo.charAt(i)=='Z') 
			{
				countZ++;
			}else if(zoo.charAt(i)=='o' || zoo.charAt(i)=='O') 
			{
				countO++;
			}
		}
		if(2*countZ==countO) 
		{
			System.out.println("Yes");
		}else 
		{
			System.out.println("No");
		}
	}
}
