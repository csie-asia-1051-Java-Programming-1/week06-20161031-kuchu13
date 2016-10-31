package ex;

import java.util.Scanner;

/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 105021033 黃苡珊
 */

public class ex05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		fun1(n);
	}

	private static void fun1(long v1) {
		long sum = 0;
		while (v1 > 0) {
			sum = (int) (sum + v1 % 10);
			v1 = v1 / 10;
		}
		System.out.println(sum);
	}
}
