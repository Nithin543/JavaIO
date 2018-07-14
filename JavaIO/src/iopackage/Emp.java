package iopackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {
	String fName;	 
	String lName;
	 
	public Emp (String fn, String ln) {	 
		fName = fn;	 
		lName = ln;	 
	}
	
	public String getfName() { return fName; }
	 
	public String getlName() { return lName; }
	
	public static void main(String[] args) {
		List<Emp> emp = Arrays.asList( new Emp ("John", "Smith"), new Emp ("Peter", "Sam"),new Emp ("Thomas", "Wale"));
		
		// Option A // System.out.println(emp.stream().sorted (Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName)).collect(Collectors.toList()));
		
		 /*// Option B // System.out.println(emp.stream()
		.sorted (Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName)) 
		.collect(Collectors.toList()));*/
		
		// Option C // System.out.println(emp.stream().map(Emp::getfName).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		// Option D // System.out.println(emp.stream().map(Emp::getfName).sorted(Comparator.reverseOrder().map(Emp::getlName).reserved.collect(Collectors.toList());
	}
}
