package Introduction;

import java.util.Scanner;

public class reverseInteger {
	public static void main(String[] args) {
		int rev = 0;
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		while(num!=0) {
			rev = (rev*10) + (num % 10 );
			num = num/10;
			
		}
		System.out.println( rev);
	}

}
