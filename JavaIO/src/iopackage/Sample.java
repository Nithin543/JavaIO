package iopackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Period;
import java.util.HashMap;
import java.util.Locale;

public class Sample {
	
	/*{
		System.out.println("Hi");
	}*/
	/*boolean use() throws Exception  {
		if(10>10) {
			throw new Exception();
		}else {
			return false;
		}	
	}*/
	static int sum() {
		return 10;
	}
	public static void main(String[] args) throws IOException {		
		Path p1 = Paths.get("/nithin");
		System.out.println(p1.getParent().getParent().getParent());
		sum();
		System.out.println();
		/*File[] x = p1.toFile().listFiles();
		for (File f : x) {
			System.out.println(f);
		}*/
		/*for(File f : p1.toFile().listFiles()) {
			System.out.println(f);
		}*/
		// Files.delete(p1);
		
		/*System.out.println(p1);
		System.out.println(p1.getFileName());
		System.out.println(p1);
		Path p2 = Paths.get("iopackage\\Animal.java");
		System.out.println(p2.getFileName());*/
		//Path s = p2;
		//System.out.println(p1);
		/*System.out.println(p1.toAbsolutePath());
		System.out.println(p1.getRoot());
		System.out.println(p1.toRealPath());*/
	}

}
