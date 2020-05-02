import java.util.Scanner;

public class SeatingArrangement 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int testCase = s.nextInt();
		int arragement[]= new int[testCase];
		for(int i=0;i<testCase;i++) 
		{
			arragement[i]=s.nextInt();
		}
		for(int i=0;i<testCase;i++) 
		{
			String ch="";
			int num=0;
			if(arragement[i]>=12)
			{
			 num=arragement[i]%12;
			}else 
			{
				num=arragement[i];
			}
			if(num==1 || num==0 || num==6 || num==7) 
			{
				ch="WS";
			}else if(num==2 || num==11 || num==8 || num==5) 
			{
				ch="MS";
			}else 
			{
				ch="AS";
			}
			if(num==6 || num==7) 
			{
				if(num==6) 
				{
				int x=arragement[i]/12;
				num=x*12+7;
				}else 
				{
					int x=arragement[i]/12;
					num=x*12+6;	
				}
			}else if(num==5 || num==8) 
			{
				if(num==5) 
				{
				int x=arragement[i]/12;
				num=x*12+8;
				}else 
				{
					int x=arragement[i]/12;
					num=x*12+5;	
				}
			}else if(num==4 || num==9) 
			{
				if(num==4) 
				{
				int x=arragement[i]/12;
				num=x*12+9;
				}else 
				{
					int x=arragement[i]/12;
					num=x*12+4;	
				}
			}else if(num==3 || num==10) 
			{
				if(num==3) 
				{
				int x=arragement[i]/12;
				num=x*12+10;
				}else 
				{
					int x=arragement[i]/12;
					num=x*12+3;	
				}
			}else if(num==2 || num==11) 
			{
				if(num==2) 
				{
				int x=arragement[i]/12;
				num=x*12+11;
				}else 
				{
					int x=arragement[i]/12;
					num=x*12+2;	
				}
			}else if(num==1 || num==0) 
			{
				if(num==1) 
				{
				int x=arragement[i]/12;
				num=x*12+12;
				}else 
				{
					int x=arragement[i]/12;
					num=(x*12)+1-12;	
				}
			}
			System.out.println(num+" "+ch);
		}
	}
	}
