package ex;

import java.util.Scanner;

/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021033 黃苡珊
 */

public class ex01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入數字");
		int n = scn.nextInt();
		System.out.print("請輸入符號");
		char c = scn.next().charAt(0);
		square(n, c);
	}

	private static void square(int v1, char v2) {

		for (int i = v1; i > 0; i--) {
			for (int j = v1; j > 0; j--) {
				System.out.print(v2);
			}
			System.out.println();
		}
	}
}
