package Introduction;

import java.util.Scanner;

public class armstrongNumber {
	public static void main(String[] args) {
		int n=0, result=0 , i;
		System.out.println("Enter any digit");
		Scanner me = new Scanner(System.in);
		int arm = me.nextInt();
		int temp = arm;
		int temp1 = arm;
		while (temp!=0) {
			temp = temp /10;
			n++;
		}
		while(temp1!=0) {
			i = temp1%10;
			result  = result + (int)Math.pow(i, n);
			temp1 = temp1 / 10;
		}
		if (arm==result ) {
			System.out.println("Yes i am an armstrong number");
		}else {
			System.out.println("Yes i am NOT an armstrong number");
		}
	}

}
