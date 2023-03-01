package com.inter_face3.testing;

public class Mountains_Rivers implements Indian_Mountains,Indian_Rivers{

	@Override
	public void himalaya() {
		System.out.println("THE HIMALAYA");
	}

	@Override
	public void aravalli_ranga() {
		System.out.println("THE ARAVALLI RANGE");
	}

	@Override
	public void ganga() {
		System.out.println("THE GANGA");
	}

	@Override
	public void cauvery() {
		System.out.println("THE CAUVERY");
	}

	@Override
	public void godavari() {
		System.out.println("THE GODAVARI");
	}
	
	public static void main(String[] args) {
		Mountains_Rivers mr = new Mountains_Rivers();
		mr.himalaya();
		mr.aravalli_ranga();
		mr.ganga();
		mr.cauvery();
		mr.godavari();
	}

}
