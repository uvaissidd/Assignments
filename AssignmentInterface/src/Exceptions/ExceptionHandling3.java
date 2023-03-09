package Exceptions;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int len = arr.length;
		int sum =0;
		try {
		for(int i = 0 ;i<len+1;i++ ) {
			sum+=arr[i];
		}
		double avg = sum/len;
		System.out.println(avg);
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	}
}
