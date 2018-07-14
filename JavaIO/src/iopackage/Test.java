package iopackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*public class Test {
	public static void sample (int x, int y, int z) {
		 
	}
	public static void main(String[] args) {
		int x,y,z;
		Test.sample(x, y);
	}
}
*/

public class Test<T> {
	 
private T t;
 
public T get () {
 
return t;
 
}
 
public void set (T t) {
 
this.t = t;
 
}
 
public static void main (String args [ ] ) {
 
/*Test<String> type = new Test<>();
 
Test type1 = new Test ();//line n1
 
type.set("Java");
 
type1.set(100);//line n2
 
System.out.print(type.get() + " " + type1.get());*/
	
	List<String> colors = Arrays.asList("red", "green", "yellow");
	 
	Predicate<String> test = n -> {
	 
	System.out.println("Searching…");
	 
	return n.contains("red");
	 
	};
	 
	colors.stream()
	 
	.filter(c -> c.length() > 3).peek(System.out::println
			
			
			)
	 
	.allMatch(test);
 
}
}
 
