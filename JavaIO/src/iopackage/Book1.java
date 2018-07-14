package iopackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Book1 {
	// private String read(String bname) { return "Read" + bname; }
	
	public static void main(String[] args) throws IOException {
		List<Integer> nums = Arrays.asList (10, 20);
			 
			// System.out.println (nums.stream().max(Comparator.comparing(a -> a)).get());
			
			// System.out.println(nums.stream().max(Integer::max).get());
			
			// System.out.println(nums.stream().max());
		
			//System.out.println(nums.stream().map(a -> a).max() );
		
		/*String str = "Java is a programming language";
		 
		ToIntFunction<String> indexVal = str::indexOf; //line n1
		 
		int x = indexVal.applyAsInt("Java");//line n2
		 
		System.out.println(x);*/
		
		/*IntStream stream = IntStream.of (1,2,3);
		 
		IntFunction<Integer> inFu = x -> y -> x*y;//line n1
		 
		IntStream newStream = stream.map(inFu.applyAsInt (10));//line n2
		 
		newStream.forEach(System.out::print);*/
		
		/*Path source = Paths.get ("N:\\\\nithin.txt");
		 
		Path destination = Paths.get("N:\\ghjbghjk");
		 
		Files.copy (source, destination);*/
		
		/*Stream<Path> paths = Stream.of (Paths. get("data.doc"),
				 
				Paths. get("N:\\nithin.txt"),
				 
				Paths. get("data.xml"));
				 
				paths.filter(s-> s.toString().endsWith("txt")).forEach(
				 
				s -> {
				 
				try {
				 
				Files.readAllLines(s)
				 
				.stream()
				 
				.forEach(System.out::println); //line n1
				 
				} catch (IOException e) {
				 
				System.out.println("Exception");
				 
				}
				 
				}
				 
				);*/
		
		/*Path path1 = Paths.get("/app/./sys/");
		 
		Path res1 = path1.resolve("log");
		
		System.out.println(res1);
		 
		Path path2 = Paths.get("/server/exe/");
		 
		Path res2 = path1.resolve("/readme");
		
		System.out.println(res2);*/
		
		/*Locale loc1 = “UK”; 
		Locale loc2 = Locale.getInstance("ru");
		Locale loc3 = Locale.getLocaleFactory(“RU”); 
		Locale loc4 = Locale.UK; 
		Locale loc5 = new Locale ("ru", "RU"); */
				 
		
	}
}
