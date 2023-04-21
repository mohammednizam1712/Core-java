package day03;

public class Executor {
	public static void main(String[] args) {
		Basee obj = new Basee();		//object creation
		obj.methodDefault();
		obj.methodProtected();
		obj.methodPublic();
		
		obj.varDefault = 1695;
		obj.methodDefault();
		
		obj.varProtected = 541981;
		obj.methodProtected();
		
		obj.varPublic = 65498;
		obj.methodPublic();
	}

}


