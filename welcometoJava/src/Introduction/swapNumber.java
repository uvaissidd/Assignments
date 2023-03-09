package Introduction;

import java.util.Scanner;

public class swapNumber {
	public static void main(String[] args) {
		int flag=0;
		System.out.println("Enter any digit");
		Scanner me1 = new Scanner(System.in);
		int num1 = me1.nextInt();
		Scanner me2 = new Scanner(System.in);
		int num2 = me2.nextInt();
		System.out.println("a = "+num1+" b = "+num2);
		num1 = num1+num2;
		num2 = num1 - num2;
		num1 = num1-num2;
		System.out.println("a = "+num1+" b = "+num2);
	}
}
