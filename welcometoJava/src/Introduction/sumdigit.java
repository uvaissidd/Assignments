package Introduction;

import java.util.Scanner;

public class sumdigit {

	public static void main(String[] args) {
		int number , temp,sum=0;
		System.out.println("Enter 4 Digit Number Only");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		while(number>0) {
		temp = number%10;
		sum = sum + temp;
		number = number/10;
		}
		System.out.println(sum);
	}
	

}
