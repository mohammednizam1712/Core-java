package hirarchical;

public class Child_B extends Parent{
	void name() {
		System.out.println("Child B name");
	}
	public static void main(String[] args) {
		Child_B b = new Child_B();
		b.name();
		b.address();
		b.phno();

	}

}

