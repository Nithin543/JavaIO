package iopackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class AnotherSampleClass {
	
	public static void main(String[] args) throws IOException   {
		
		/*Path source = Paths.get("N:\\Nithin\\test.txt");
		 
		Path target = Paths.get("N:\\ex\\sowmith.txt");
		 
		Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
		 
		Files.delete(source);*//*
		List<Integer> list1 = Arrays.asList(10, 20);
		 
		List<Integer> list2 = Arrays.asList(15, 30);
		
		Stream.of(list1, list2) .flatMapToInt(list ->list.stream()) .forEach(s -> System.out.print(s + ""));*/
		
		TreeSet ts = new TreeSet<>();
		ts.add(null);
	}
}
