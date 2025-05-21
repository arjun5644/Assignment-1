package main;

interface Vehicle{
	
	void start();
	void stop();
	
}

class Car implements Vehicle{
	public void start() {
		System.out.println("car is starting...");
	}
	
	public void stop() {
		System.out.println("car is stopping...");
	}
	
}

class Bike implements Vehicle {
	public void start() {
		System.out.println("Bike is starting...");
	}
	
	public void stop() {
		System.out.println("Bike is stopping...");
	}
	
}
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;
		v=new Car();
		v.start();
		v.stop();
		
		v=new Bike();
		v.start();
		v.stop();
		

	}

}
