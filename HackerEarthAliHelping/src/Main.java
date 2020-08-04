import java.io.*; 
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        int ans=findLongestConseqSubseq(arr,n,k);
        System.out.println(ans);
	}
   public static int findLongestConseqSubseq(int a[], int n,int k) 
    { 
		int c = 0;
  		 for(int i=0; i<n; i++)
         {
      		for(int j=i+1;j<n;j++)
            {
                if(Math.abs(a[i]-a[j])<=k)
                {
                    c++;
                }       
            }
  		 }
   		return n + c;
    } 
  

}