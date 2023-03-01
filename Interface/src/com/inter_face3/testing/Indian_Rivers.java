package com.inter_face3.testing;

public interface Indian_Rivers {

	void ganga();

	void cauvery();

	void godavari();

	public static void main(String[] args) {
		Indian_Rivers r = new Mountains_Rivers();
		r.ganga();
		r.cauvery();
		r.godavari();
	}

}
