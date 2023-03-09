package Introduction;

public class GreatestNumberArray {

	public static void main(String[] args) {
		int i[] = {32,43,100,28};
		int k = i[0];
		for (int j= 0; j<i.length;j++) {
			if (i[j]>k) {
				k=i[j];
			}
		}
		System.out.println("greatest number of an array : "+k);
	}

}
