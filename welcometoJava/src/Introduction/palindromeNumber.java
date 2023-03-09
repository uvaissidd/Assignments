package Introduction;

import java.util.Scanner;

public class palindromeNumber {
	public static void main(String[] args) {
		int rev = 0;
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		while(temp!=0) {
			rev = (rev*10) + (temp % 10 );
			temp = temp/10;
			
		}
		if (num==rev) {
			System.out.println( "palindrome number");
		}else {
			System.out.println( "not palindrome number");
		}
	}

}

