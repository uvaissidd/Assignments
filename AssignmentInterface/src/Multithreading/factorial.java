package Multithreading;

public class factorial extends Thread {
	int x ;
	factorial(int n){
		x=n;
	}
	public void run() {
		int fact=1;
		for(int i=1; i<=x;i++ ) {
			fact *=i;
		}
		System.out.println("factorial : "+fact);
	}
	
}
