package Bit_Masking;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Index(s));

	}

	public static int Index(String s) {
		int n = s.length();
		// n-1 digit tk saare count
		int c = (1 << n) - 2;
		int pos = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				c = c + (1 << pos);
			}
			pos++;
		}
		return c + 1;
	}

}
