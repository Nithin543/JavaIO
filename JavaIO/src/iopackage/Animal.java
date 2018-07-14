package iopackage;

import java.io.Serializable;

public class Animal implements Serializable {
	
	Animal(){
		System.out.println(" This is Animal ");
	}
	public static void test() throws RuntimeException {
		
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		
		/*File f = new File("C:\\Users\\nooka\\eclipse-workspace\\JavaIO\\src");
		
		System.out.println(f.getParent());*/
		
		//test();
		
		int rateOfInterest = 0;
		 
		String accountType = "LOAN";
		 
		switch (accountType) {
		 
		case "RD" :
		 
		rateOfInterest = 5;
		 
		break;
		 
		case "FD":
		 
		rateOfInterest = 10;
		 
		break;
		 
		default:
		 
		assert false: "No interest for this account"; //line n1
		 
		}
		 
		System.out.println ("Rate of interest:" + rateOfInterest);
		 
		}
	}

