package com.inter_face2.testing;

public class Class3 implements Class1, Class2 {

	@Override
	public void honda() {
		System.out.println("Honda Activa");		
	}

	@Override
	public void TVS() {
		System.out.println("TVS 50");		
	}

	@Override
	public void hero() {
		System.out.println("Hero Splendor");		
	}

	@Override
	public void yamaha() {
		System.out.println("Yamaha RX-100");		
	}
	
	public static void main(String[] args) {
		Class3 j = new Class3();
		j.honda();
		j.TVS();
		j.hero();
		j.yamaha();
	}

}
