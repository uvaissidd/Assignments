package Multithreading;

public class random extends Thread{
	public void run() {
		int num= 5+(int) Math.random() * 10;
		System.out.println("Random Number : "+num);
		factorial fa =new factorial(num);
		fa.start();
	}
}
