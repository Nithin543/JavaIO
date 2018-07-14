package iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyInputStreams {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\\\Users\\\\nooka\\\\eclipse-workspace\\\\JavaIO\\\\src\\\\test.txt");
		FileInputStream fis= new FileInputStream(f);
		int i;
		
		while((i = fis.read()) != -1) {
			System.out.println(i);			
		}
		fis.close();
		
		
		
		
	}

}
