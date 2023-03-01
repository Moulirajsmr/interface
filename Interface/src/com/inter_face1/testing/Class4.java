package com.inter_face1.testing;

public class Class4 implements Class1, Class2, Class3{

	@Override
	public void bike() {
		System.out.println("Honda");		
	}

	@Override
	public void car() {
		System.out.println("Toyato");		
	}

	@Override
	public void bus() {
		System.out.println("Tata");		
	}

	@Override
	public void van() {
		System.out.println("Maruti");		
	}

	@Override
	public void bicycle() {
		System.out.println("Herculus");		
	}

	@Override
	public void scooter() {
		System.out.println("TVS");		
	}
	
	public static void main(String[] args) {
		Class4 m = new Class4();
		m.bike();
		m.car();
		m.bus();
		m.van();
		m.bicycle();
		m.scooter();
	}

}
