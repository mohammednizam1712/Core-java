package day03;

import day03.Basee;

public class Executorrr {

	public static void main(String[] args) {
		Basee b = new Basee();
		//private, default, protected members cannot be access outside the package
		b.methodPublic();
		
		b.varPublic = 22;
		b.methodPublic();
	}

}
