package iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class Book implements Comparator<Book>{
	String name; double price;
	 
	public Book () {}
	 
	public Book(String name, double price) {	 
	this.name = name;	 
	this.price = price;	 
	}
	
	public int compare(Book b1, Book b2) {
		 return b1.name.compareTo(b2.name);
	}
	
	public String toString() {
		return name + ":" + price;
	}
	public static void main(String[] args) {
		List<Book>books = Arrays.asList (new Book ("Beginning with Java", 2), 
										 new Book ("A Guide to Java Tour", 3));
		Collections.sort(books, new Book());				 
		System.out.print(books);
	}
	/*public static void main(String[] args) throws IOException {
		File f = new File("nithin.txt");
		FileOutputStream fos1 = new FileOutputStream(f);
		System.out.println();
		FileInputStream fos2 = new FileInputStream(f);
		System.out.println(fos2.markSupported());
		OutputStream o = null;
		byte[] b = {'a','b'};
		o.write(b, 1, 1);
		
		byte b1 = 'c';
		System.out.println(b1);
		System.out.println(System.getProperty("path.separator"));
		File f = new File("nithin.txt");
		ObjectInputStream oos = new ObjectInputStream(new FileInputStream(f));
		String i;
		while((i = args[0]) != null) {
			
		}
		
		UnaryOperator<Integer> uo1 = s -> s*2; // line n1
		 
		List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
		 
		loanValues.stream().filter(lv -> lv >= 1500).map(lv -> uo1.apply(lv)).forEach(s -> System.out.print(s + ""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}*/

}
