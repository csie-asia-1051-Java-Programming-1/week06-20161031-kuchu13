package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float v1 = scn.nextFloat();
		int type = scn.nextInt();
		System.out.println(fun1(v1, type));
	}
	public static float fun1(float a, int b) {
		float i = 0;
		if (b == 1) {
			i = (a - 32) * 5 / 9;
		} else if (b == 2) {
			i = (a * 9 / 5) + 32;
		}
		return i;
	}
}