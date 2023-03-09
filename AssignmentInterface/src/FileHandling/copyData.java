package FileHandling;

import java.io.*;

public class copyData {
	public static void Data(File file1 , File file2) throws Exception
	{
		FileInputStream fi1 = new FileInputStream(file1);
		FileOutputStream fi2 = new FileOutputStream(file2);
		try {
			int i;
			while((i = fi1.read())!=-1) {
				fi2.write(i);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(fi1!= null) {
				fi1.close();
			}
			if (fi2!= null) {
				fi2.close();
			}
		}
		System.out.println("File Coppied");
	}
}
