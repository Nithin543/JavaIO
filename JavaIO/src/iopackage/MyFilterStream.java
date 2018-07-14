package iopackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class MyFilterStream {
	
	/*public static void main(String[] args) throws IOException {
		File file = new File("venkat.txt");
		FileOutputStream fos = new FileOutputStream(file);
		// FilterOutputStream filterOS = new FilterOutputStream(fos);
                byte[] b = "namaste".getBytes();
	        for(int i=0;i<b.length;i++){
	    	  fos.write(b[i]);
	        }
	        fos.close();
	        System.out.println("Done");
	}*/
	
	public static void main(String[] args) throws IOException {
		File file = new File("venkat.txt");
		FileInputStream  fis = new FileInputStream(file); 
		FilterInputStream filterIs = new BufferedInputStream(fis);
		
		
		
		
		
		int i =0;
		while((i=filterIs.read())!=-1){
			System.out.print((char)i);
		}
		fis.close();
		filterIs.close();
	}

}
