import java.util.Arrays;
import java.util.Scanner;

public class TwoString {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] agrs) {
		int numOfTestCase = s.nextInt();
		for (int i = 0; i < numOfTestCase; i++) {
			String s1 = new String();
			s1 = s.next();
			String s2 = new String();
			s2 = s.next();
			checkTwoString(s1, s2);
		}
	}

	private static void checkTwoString(String s1, String s2) {
		char []arr1 = s1.toCharArray(); 
		char []arr2 = s2.toCharArray();
        Arrays.sort(arr1); 
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)) 
        {
        	System.out.println("YES");
        }else 
        {
        	System.out.println("NO");
        }

	}

}
