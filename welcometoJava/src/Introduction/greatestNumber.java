package Introduction;

import java.util.Scanner;

public class greatestNumber {
	public static void main(String[] args) {
		int flag=0;
		System.out.println("Enter any digit");
		Scanner me1 = new Scanner(System.in);
		int num1 = me1.nextInt();
		Scanner me2 = new Scanner(System.in);
		int num2 = me2.nextInt();
		Scanner me3 = new Scanner(System.in);
		int num3 = me3.nextInt();
		if (num1>=num2 && num1>=num3) {
			System.out.println(num1+" a is greater");
		}else if (num2>=num1 && num2>=num3){
			System.out.println(num2+" b is greater");
		}else {
			System.out.println(num3+" c is greater");
		}
		
	}

}
