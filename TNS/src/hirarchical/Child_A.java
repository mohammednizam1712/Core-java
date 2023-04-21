package hirarchical;

public class Child_A extends Parent {
	void name() {
		System.out.println("Child A name");
	}

	public static void main(String[] args) {
		Child_A a = new Child_A();
		a.name();
		a.address();
		a.phno();
	}

}