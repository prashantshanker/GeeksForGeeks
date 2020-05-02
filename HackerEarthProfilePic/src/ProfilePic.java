import java.util.Scanner;

public class ProfilePic {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int lenght =s.nextInt();
		int noTestCase=s.nextInt();
		int widhtHeight[][] = new int[noTestCase][2];
		for(int i=0;i<noTestCase;i++) 
		{
			for(int j=0;j<2;j++) 
			{
				widhtHeight[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<noTestCase;i++) 
		{
			for(int j=0;j<1;j++) 
			{
				if((lenght==widhtHeight[i][j] && lenght==widhtHeight[i][j+1]) || (widhtHeight[i][j]==widhtHeight[i][j+1] && widhtHeight[i][j]>=lenght)) 
				{
					System.out.println("ACCEPTED");
				}else if(lenght<=widhtHeight[i][j] && lenght<=widhtHeight[i][j+1])
				{
					System.out.println("CROP IT");
				}else 
				{
					System.out.println("UPLOAD ANOTHER");
				}
			}
		}
	}
}
