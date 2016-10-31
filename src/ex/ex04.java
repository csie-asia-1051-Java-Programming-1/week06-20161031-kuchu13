package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021033 黃苡珊
 */

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請問要輸入幾個資料");
		int n = scn.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = scn.nextInt();
		}
		square(data, n);
	}

	public static void square(int square[], int o) {
		for (int i = 0; i < o; i++) {
			System.out.print(square[i] * square[i] + "\t");

		}
	}
}