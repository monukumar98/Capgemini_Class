package Bit_Masking;

public class check_Ith_Bit_Set_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 567;
		int pos = 4;
		int mask = (1 << pos);
		if ((n & mask) == 0) {
			System.out.println("Set nhi hai");
		} else {
			System.out.println("Set hai");
		}

	}

}
