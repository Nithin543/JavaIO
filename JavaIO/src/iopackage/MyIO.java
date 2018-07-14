package iopackage;

import java.io.File;
import java.io.IOException;

public class MyIO {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\nooka\\eclipse-workspace\\JavaIO\\src\\test.txt");
		
		// 1. File Exists
		
		System.out.println(f.exists());
		System.out.println(f.isFile());		
		System.out.println(f.canRead());		
		System.out.println(f.canWrite());		
		System.out.println(f.canExecute());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		
		// 2. List Of Files
		
		File file = new File("C:\\Users\\nooka\\eclipse-workspace\\JavaIO\\src\\");
		
		if(file.isDirectory()) {
			System.out.println(" This is a Directory ");
			File[] filesList = file.listFiles();
			for(File fi :filesList)
				System.out.println(f.getAbsolutePath());
		}
		
		// 3. File Seperator
		
		String filePath = File.separator;
		String s = System.getProperty("file.separator");
		System.out.println(filePath + " " + s);
		
		// 4. 
		
		String path = "C:\\\\Users\\\\nooka\\\\eclipse-workspace\\\\JavaIO\\\\src\\\\";
		StringBuffer sb = new StringBuffer(path).append(filePath).append("test.txt");
		
		File newFile = new File(sb.toString());
		System.out.println(newFile.getParent());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
