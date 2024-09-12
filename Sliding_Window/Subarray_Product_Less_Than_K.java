package Sliding_Window;

public class Subarray_Product_Less_Than_K {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4, 2 };
		int k = 10;

	}

	public static int Product_Less_Than_K(int[] arr, int k) {
		int ei = 0, si = 0, p = 1, ans = 0;
		while (ei < arr.length) {
			// grow
			p = p * arr[ei];

			// shrink
			while (p >= k && si <= ei) {
				p = p / arr[si];
				si++;
			}

			// ans cal
			ans += (ei - si + 1);
			ei++;
		}
		return ans;
	}
}
