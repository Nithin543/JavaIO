package iopackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWrite {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(
							new FileWriter(
							new File(
							"C:\\\\\\\\Users\\\\\\\\nooka\\\\\\\\eclipse-workspace\\\\\\\\JavaIO\\\\\\\\src\\\\\\\\animalTest.txt")));
		
		PrintWriter pw = new PrintWriter(bw);
		bw.write("Hello");
		
		pw.println("Good Morning");
		pw.flush();
		pw.close();
		
		
	}

}
