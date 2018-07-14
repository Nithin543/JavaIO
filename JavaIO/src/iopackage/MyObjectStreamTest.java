package iopackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyObjectStreamTest {
	
	public static void main(String[] args) throws IOException {
		
		File animalFile = new File("C:\\\\Users\\\\nooka\\\\eclipse-workspace\\\\JavaIO\\\\src\\\\animal.txt");
		FileOutputStream fos = new FileOutputStream(animalFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(new Animal());
		oos.flush();
		oos.close();
		
		
		
	}

}
