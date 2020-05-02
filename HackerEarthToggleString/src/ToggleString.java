import java.util.Scanner;

public class ToggleString {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str=s.next();
		String strNew="";
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') 
			{
				strNew=strNew+(char)(str.charAt(i)+32);
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') 
			{
				strNew=strNew+(char)(str.charAt(i)-32);		
			}
		}
		System.out.println(strNew);
	}
}
