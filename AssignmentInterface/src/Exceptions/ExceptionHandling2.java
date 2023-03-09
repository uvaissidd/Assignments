package Exceptions;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<2;i++) {
			String Name = "";
			int sub1 = 0;
			int sub2 = 0;
			int sub3 = 0;
			try {
				Name = sc.next();
				if(sc.hasNextInt()) {
					sub1= sc.nextInt();
				}
				else {
					throw new NumberFormatException();
					}
				if(sc.hasNextInt()) {
					sub2= sc.nextInt();
				}
				else {
					throw new NumberFormatException();
					}
				if(sc.hasNextInt()) {
					sub3= sc.nextInt();
				}
				else {
					throw new NumberFormatException();
					}
				if (sub1<0) {
					throw new NegativeValuesException();
				}
				if (sub1>100) {
					throw new ValuesOutOfRangeException();
				}
				if (sub2<0) {
					throw new NegativeValuesException();
				}
				if (sub2>100) {
					throw new ValuesOutOfRangeException();
				}
				if (sub3<0) {
					throw new NegativeValuesException();
				}
				if (sub1>100) {
					throw new ValuesOutOfRangeException();
				}
			}catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
			catch(NegativeValuesException e){
				System.out.println(e.getMessage());
			}
			catch(ValuesOutOfRangeException e){
				System.out.println(e.getMessage());
			}
			System.out.println("Name: "+Name);
			System.out.println("Marks of subject 1: "+sub1);
			System.out.println("Marks of subject 2: "+sub2);
			System.out.println("Marks of subject 3: "+sub3);
		}
		sc.close();
	}

}
