package Introduction;

import java.util.Scanner;

public class FabonacciSeries {
	public static void main(String[] args) {
		int firstNum =0 , secondNum=1, result;
		System.out.println("Enter any digit");
		Scanner me = new Scanner(System.in);
		int num = me.nextInt();
		System.out.println("fabonacci series....");
		for (int i =0 ; i<=num; i++ ) {
			if (i<=1) {
				result = i;
			
			}else {
				result = firstNum+secondNum;
				firstNum = secondNum;
				secondNum = result;
				
			}
			System.out.println(result);
		}
	}

}
