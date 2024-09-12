package Sliding_Window;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";

	}

	public static int Longest_Substring(String s) {
		int[] freq = new int[256];
		int si = 0, ei = 0, ans = 0;
		while (ei < s.length()) {
			// grow
			char ch =s.charAt(ei);
			freq[ch]++;

			// shrink
			while(freq[ch]>1) {
				char ch1 =s.charAt(si);
				freq[ch1]--;
				si++;
			}

			// ans
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;

	}
}
