package Sliding_Window;

public class Maximum_Sum_Window_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 1, 2, 7, 5, 9, 3, 2, 4 };
		int k = 3;
		System.out.println(Maximum_Sum(arr, k));
	}
	public static int Maximum_Sum(int[] arr, int k) {
		int ans = 0, sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];// window grow hogya
			sum -= arr[i - k];// window shrink hogya
			ans = Math.max(ans, sum);
		}
		return ans;
	}
}
