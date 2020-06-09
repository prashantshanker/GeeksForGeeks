import java.util.Scanner;

public class MagicalWord {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] agrs) 
	{
		int testCase = s.nextInt();
		for(int i=0;i<testCase;i++)
		{
			int stringLenght=s.nextInt();
			String str = new String();
			str=s.next();
			printMagicWord(str);
		}
	}
	private static void printMagicWord(String str) 
	{
		String magicWord = new String();
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)>=0 && str.charAt(i)<='E') 
			{
				magicWord+='C';
			}else if(str.charAt(i)>='F' && str.charAt(i)<='H') 
			{
				magicWord+='G';
			}else if(str.charAt(i)>='I' && str.charAt(i)<='L') 
			{
				magicWord+='I';
			}else if(str.charAt(i)>='M' && str.charAt(i)<='Q') 
			{
				magicWord+='O';
			}else if(str.charAt(i)>='R' && str.charAt(i)<='V') 
			{
				magicWord+='S';
			}else if(str.charAt(i)>='W' && str.charAt(i)<='Z')
			{
				magicWord+='Y';
			}else if(str.charAt(i)>='a' && str.charAt(i)<='c')
			{
				magicWord+='a';
			}else if(str.charAt(i)>='d' && str.charAt(i)<='f') 
			{
				magicWord+='e';
			}else if(str.charAt(i)>='g' && str.charAt(i)<='i') 
			{
				magicWord+='g';
			}else if(str.charAt(i)>='j' && str.charAt(i)<='l') 
			{
				magicWord+='k';
			}else if(str.charAt(i)>='m' && str.charAt(i)<='o')
			{
				magicWord+='m';
			}else if(str.charAt(i)>='p' && str.charAt(i)<=127) 
			{
				magicWord+='q';
			}
		}
		System.out.println(magicWord);
	}
}
