package iopackage;

public class Console {

	public static void main(String[] args) {
		
		java.io.Console s = System.console();
		System.out.println(" Enter Your Name ");
		String str = s.readLine();
		System.out.println(str);
		
		char[] ch = s.readPassword();
		
		
	}
}
