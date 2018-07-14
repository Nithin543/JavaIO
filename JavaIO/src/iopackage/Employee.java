package iopackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

class Employee {
	 
Optional<Address> address;
 
Employee (Optional<Address> address) {
 
this.address = address;
 
}
 
public Optional<Address> getAddress() { return address; }
 
}
 
 
class Address {
 
String city = "New York";
 
public String getCity() { return city; }
 
public String toString() {
 
return city;
 
}
public static void main(String[] args) throws Exception {
	/*Address address = null;
	 
	Optional<Address> addrs1 = Optional.ofNullable (address);
	 
	Employee e1 = new Employee (addrs1);
	 
	String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
	
	System.out.println(eAddress);
	
	System.out.println("Em Ayndhi");*/
	
	int count=0;
	count++;
	System.out.println(count);
	System.out.println("Hi");
	
	
}
 
}
