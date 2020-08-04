import java.util.Scanner;

public class Cipher {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] agrs) 
	{
		String str = new String();
		str=s.nextLine();
		int noToRotate = s.nextInt();
		printCipher(str,noToRotate);
	}
	private static void printCipher(String str, int x) 
	{
		String cipher = new String();
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				int ch=str.charAt(i)+x;
				if(ch>'Z') 
				{
					ch=ch-'Z'-1;
					ch='A'+ch;
				}
				char c= (char)(ch);
				cipher=cipher+c;
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') 
			{
				int ch=str.charAt(i)+x;
				if(ch>'z') 
				{
					ch=ch-'z';
					ch='a'+ch-1;
				}
				char c= (char)(ch);
				cipher=cipher+c;
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9') 
			{
				int ch=str.charAt(i)+x;
				if(ch>'9') 
				{
					ch=ch-'9';
					ch='0'+ch-1;
				}
				char c= (char)(ch);
				cipher=cipher+c;
			}else 
			{
				cipher=cipher+(str.charAt(i));
			}
		}
		System.out.println(cipher);
	}
}
