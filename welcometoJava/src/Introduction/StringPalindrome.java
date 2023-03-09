package Introduction;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		String value, rev="";
		System.out.println("Enter any word for check it is palindrome");
		Scanner scan1 = new Scanner(System.in);
		value = scan1.nextLine();
		int len = value.length();
		for (int i = len-1; i>=0; i--) {
			rev = rev + value.charAt(i);
		} 
		if (value.equals(rev)) {
			System.out.println("yeah i am palindrome String");
		}	
		else {
			System.out.println("i am NOT palindrome String");
		}
	}

}
