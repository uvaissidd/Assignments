package Exceptions;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		String Name;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enater a name");
		Name = sc.next();
		System.out.println("Enater a age");
		age = sc.nextInt();
		try {
			if(age<18||age>=60) {
				throw new InvalidAgeException("Age Invalid");
			}
			System.out.println("Name : "+Name+"\nAge : "+age);
		}catch (InvalidAgeException e){
			System.out.println(e);
		}
	}

}
