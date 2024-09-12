package Bit_Masking;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 67;
		System.out.println(CoutSetBit(n));

	}

	public static int CoutSetBit(int n) {
		int c = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				c++;
			}
			n >>= 1;// n=n>>1;
		}
		return c;
	}

	public static int Fast_CoutSetBit(int n) {
		int c = 0;
		while (n > 0) {
			n = (n & (n - 1));
			c++;
		}
		return c;
	}

}
