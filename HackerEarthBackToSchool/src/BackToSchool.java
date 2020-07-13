import java.util.Scanner;

public class BackToSchool {
	public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int[] arr = new int[3];
        for(int i=0;i<3;i++)
        {
            arr[i]=s.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print(max);
	}
}
