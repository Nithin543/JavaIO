package iopackage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathsaas {
	
	public static void main(String[] args) throws URISyntaxException, IOException {
		
		/*Path path2 = Paths.get("/Nithin.txt");
		System.out.println(path2.getNameCount());
		System.out.println(path2.getName(0));
		System.out.println(path2);
		System.out.println(path2.getFileName());
		System.out.println(path2.isAbsolute());
		System.out.println(path2.getRoot());*/
		
//		Path path = Paths.get("/mammal/carnivore/raccoon.image");
//		System.out.println("Path is: "+path);
//		System.out.println("Subpath from 0 to 3 is: "+path.subpath(0,3));
//		System.out.println("Subpath from 1 to 3 is: "+path.subpath(3,3));
//		System.out.println("Subpath from 1 to 2 is: "+path.subpath(1,2));
		
		/*Path path3 = Paths.get("\\abitat\\nithin\\nooka");
		Path path4 = Paths.get("/sanctuary\\raven");
		System.out.println(path3.relativize(path4));
		System.out.println(path4.relativize(path3));*/
		
		/*Path path1 = Paths.get("/primate/chimpanzee");
		System.out.println(path1.isAbsolute());
		System.out.println(path1.getRoot());
		Path path2 = Paths.get("bananas.txt");
		System.out.println(path2.getRoot());
		System.out.println(path1.isAbsolute());
		// path1.relativize(path2); 
*/		
		//final Path path1 = Paths.get("/");
		//System.out.println(path1.getRoot());
		//System.out.println(path1.getParent());
		//System.out.println(path1.toAbsolutePath());/*
		//final Path path2 = Paths.get("\\tiger\\..\\cage\\..");
		// System.out.println(path2.getRoot());
		//System.out.println(path1.resolve(path2).normalize());*/
		
		
		final Path path = Paths.get("").normalize(); // h1
		System.out.println(" Path is :" + path);
		System.out.println(" Name : " + path.getNameCount());
		int count = 0;
		for(int i=0; i<path.getNameCount(); ++i) {
		 count++;
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
