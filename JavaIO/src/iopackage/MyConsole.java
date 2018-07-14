package iopackage;

public class MyConsole implements AutoCloseable{
	 public static void main(String[] args) {
	 java.io.Console console = System.console();
	 if(console != null) {
	 String userInput = console.readLine();
	 console.writer().println ("You entered the following: "+userInput);
	 }
	 System.out.println("Not Supported");
	 }

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	}

