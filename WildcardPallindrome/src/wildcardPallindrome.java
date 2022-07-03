
public class wildcardPallindrome {

	public static void main(String[] args) {
		String s = "a?b?a";
		int n = s.length();
		String ans = solve(s, n);
		System.out.println(ans);
	}

	private static String solve(String s, int n) {
		String ans = "";
		int midend=0;
		int midstart=0;
		if (n == 1) {
			return s;
		}
		if (n % 2 == 0) {
			 midstart = (n / 2) - 1;
			 midend = n / 2;
		}else 
		{
			 midstart = (n / 2) - 1;
			 midend = (n / 2) + 1;
			ans= ans+s.charAt(n/2);
		}
			while (midstart >= 0 && midend <= n - 1) {
				if (s.charAt(midstart) == s.charAt(midend)) {
					if (s.charAt(midstart) == '?' && s.charAt(midend) == '?') {
						ans = "a" + ans + "a";
					} else {
						ans = s.charAt(midstart) + ans + s.charAt(midend);
					}
					midstart--;
					midend++;

				} else if ((s.charAt(midstart) == 'a' || s.charAt(midend) == 'a')
						&& (s.charAt(midstart) == '?' || s.charAt(midend) == '?')) {
					ans = "a" + ans + "a";

				} else if ((s.charAt(midstart) == 'a' || s.charAt(midend) == 'a')
						&& (s.charAt(midstart) == '?' || s.charAt(midend) == '?')) {
					ans = "a" + ans + "a";
					midstart--;
					midend++;
				} else if ((s.charAt(midstart) == 'b' || s.charAt(midend) == 'b')
						&& (s.charAt(midstart) == '?' || s.charAt(midend) == '?')) {
					ans = "b" + ans + "b";
					midstart--;
					midend++;
				} else if (s.charAt(midstart) == '?' && s.charAt(midend) == '?') {
					ans = "a" + ans + "a";
					midstart--;
					midend++;

				} else {
					return "NO";
				}
			}
		return ans;
	}

}
