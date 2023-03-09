package Introduction;
import java.util.Scanner;

public class monthName {

	public static void main(String[] args) {
		int number ;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		switch (number) {
		case 1: 
			System.out.println("JANUARY");
			break;
		case 2: 
			System.out.println("FEBURARY");
			break;
		case 3: 
			System.out.println("MARCH");
			break;
		case 4: 
			System.out.println("APRIL");
			break;
		case 5: 
			System.out.println("MAY");
			break;
		case 6: 
			System.out.println("JUNE");
			break;
		case 7: 
			System.out.println("JULY");
			break;
		case 8: 
			System.out.println("AUGUST");
			break;
		case 9: 
			System.out.println("SEPTEMBER");
			break;
		case 10: 
			System.out.println("OCTOBER");
			break;
		case 11: 
			System.out.println("NOVEMBER");
			break;
		case 12: 
			System.out.println("DECEMBER");
			break;
		default: 
			System.out.println("enter only 1 to 12");
			break;
		}
		
	}

}
