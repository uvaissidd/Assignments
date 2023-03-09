package FileHandling;

import java.io.*;
import java.util.Random;

public class dice {
	public static void main( String[] args ) {
	    Random ran = new Random();
	    int number = 0;
	    number = ran.nextInt(30);
	    try {
	    	FileWriter file = new FileWriter("Number.txt");
	        for (int i = 1; i<number;i++) {
	        	file.write(i);
	        }
	        file.close();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    System.out.println("file created");
	}

}
