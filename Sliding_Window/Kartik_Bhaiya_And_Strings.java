package Sliding_Window;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abababbaaaaba";
		int k = 2;
		int flipa = LongestLenght(s, k, 'a');
		int flipb = LongestLenght(s, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int LongestLenght(String s, int k, char ch) {
		int si = 0, ei = 0, ans = 0, flip = 0;
		while (ei < s.length()) {
			// grow
			if (s.charAt(ei) == ch) {
				flip++;
			}

			// shrink
			while (flip > k && si <= ei) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}

			// ans
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}
}
