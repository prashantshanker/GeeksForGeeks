import java.util.Scanner;

public class SplitHouse {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int grids=s.nextInt();
		String str=s.next();
		if(str.contains("HH")) 
		{
			System.out.println("NO");
		}else 
		{
//			str=str.replace(".","B");
			for(int i=0;i<grids;i++) 
			{
				if(str.charAt(i)=='.') 
				{
					str=str.replace(".", "B");
				}
			}
			System.out.println("Yes");
			System.out.println(str);
		}
	}
}
