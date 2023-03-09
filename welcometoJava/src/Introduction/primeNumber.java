package Introduction;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		int flag=0;
		System.out.println("Enter any digit");
		Scanner me = new Scanner(System.in);
		int num = me.nextInt();
		if(num==0||num==1) {
			System.out.println(num+"is Not a prime number");
		}else {
			for(int i = 2 ;i<=num/2;i++) {
				if (num%i==0) {
				System.out.println(num+"is not a prime number");
				flag= 1;
				break;
			}
			}
			if (flag==0) {
				System.out.println(num+" is a prime number");
			}
		}
	}
}
