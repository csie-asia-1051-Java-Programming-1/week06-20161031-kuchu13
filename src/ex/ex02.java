package ex;

import java.util.Scanner;

/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021033 黃苡珊
 */

public class ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入正整數 m、n");
		int m = scn.nextInt();
		int n = scn.nextInt();

		System.out.println(fun1(m) / (fun1(n) * fun1(m - n)));

	}

	public static int fun1(int o) {
		int sum = 1;
		for (int i = 1; i <= o; i++) {
			sum *= i;
		}
		return sum;
	}
}