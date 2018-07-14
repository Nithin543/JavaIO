package iopackage;

import java.util.Set;
import java.util.TreeSet;

class Vehicle1 {
	 
int vno;
 
String name;
 
 
public Vehicle1 (int vno, String name) {
 
this.vno = vno;
 
this.name = name;
 
}
 
public String toString () {
 
return vno + ":" + name;
 
}
public static void main(String[] args) {
	
	Set<Vehicle1> vehicles = new TreeSet <> ();
	 
	vehicles.add(new Vehicle1 (10123, "Ford"));
	 
	 
	System.out.println(vehicles);
}
 
}