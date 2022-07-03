import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		String s = "abcadbcebcbbabghjhh";
		
		int duplicateCharPos = 0;
        int currentPos = 0;  
        int maxCount = 0;
        
        Set<Character> hs= new HashSet();
        while(currentPos < s.length()){
            if(!hs.contains(s.charAt(currentPos))){
                hs.add(s.charAt(currentPos));
                currentPos++;
                maxCount= Math.max(hs.size(),maxCount);
            }else{
                hs.remove(s.charAt(duplicateCharPos));
                duplicateCharPos++;
            }
        }
        
		
		System.out.println(maxCount);

	}
}
