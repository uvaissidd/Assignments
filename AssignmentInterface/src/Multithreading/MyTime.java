package Multithreading;

import java.util.*;

public class MyTime {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		while(true) {
			Thread.sleep(2000);
			System.out.println(new Date());
			long finish = System.currentTimeMillis();
			if ((finish - start)>= 20000) {
				break;
			}
		}
	}
}
