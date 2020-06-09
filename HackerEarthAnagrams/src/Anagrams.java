import java.util.Scanner;

public class Anagrams {

	static Scanner s= new Scanner(System.in);
	public static void main(String[] args)
	{
		int testCase = s.nextInt();
		for(int i=0;i<testCase;i++)
		{
			String s1=s.next();
			String s2=s.next();
			System.out.println(remAnagram(s1, s2));
		}
	}
	private static int remAnagram(String str1, String str2) 
    { 
	      int count1[] = new int[26];  
	      int count2[] = new int[26]; 
	        for (int i = 0; i < str1.length() ; i++) {
	            count1[str1.charAt(i) -'a']++; 
	        }
	        for (int i = 0; i < str2.length() ; i++) {
	            count2[str2.charAt(i) -'a']++; 
	        }
	        int result = 0; 
	        for (int i = 0; i < 26; i++) {
	            result += Math.abs(count1[i] - count2[i]); 
	        }
	        return result; 
    } 
}
