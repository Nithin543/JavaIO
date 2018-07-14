package iopackage;

public class SolarVehicle extends Vehicle {
	
	public void ride () throws Exception {//line n2
		 
		super.ride();
		 
		}
	
	public static void main (String[] args) throws FuelNotAvailException, Exception {
		 
		Vehicle v = new SolarVehicle ();
		 
		v.ride();
		 
		}

}
