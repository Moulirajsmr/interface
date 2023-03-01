package com.inter_face.testing;

public class Class3 implements Class1, Class2 {

	@Override
	public void goa() {
System.out.println("panaji");		
	}
	@Override
	public void maharastra() {
System.out.println("mumbai");		
	}
	@Override
	public void telungana() {
System.out.println("vizag");		
	}
	@Override
	public void tamilnadu() {
System.out.println("chennai");		
	}
	@Override
	public void kerala() {
System.out.println("kochin");		
	}
	@Override
	public void karnataka() {
System.out.println("bengaluru");		
	}
public static void main(String[] args) {
	Class3 d = new Class3();
	d.goa();
	d.maharastra();
	d.telungana();
	d.tamilnadu();
	d.kerala();
	d.karnataka();
}
}
