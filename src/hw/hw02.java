package hw;

import java.util.Scanner;

public class hw02 {
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	int v1 = scn.nextInt();
	float v2 = scn.nextFloat();
	System.out.println(fun1(v1,v2));
}
public static float fun1(int a, float b) {
	float i = 0;
	if (a == 1) {
		i = (float) ((b-170)*0.6+62);
	} else if (a == 2) {
		i = (float) ((b-158)*0.5+52);
	}
	return i;
}
}