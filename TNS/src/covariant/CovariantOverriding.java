package covariant;

	//base class
	class Color{
		protected Color getColor() {
			Color s = new Color();
			return s;
		}
	}

	//this class will be inherited from class color & override the method getColor
	class Red extends Color{
		public Red getColor() {
			Red s = new Red();
			return s;
		}
	}
	public class CovariantOverriding {

		public static void main(String[] args) {
			Color c1 = new Color();
			Color c2 = c1.getColor();
			System.out.println(c2);
			
			Red r1 = new Red();
			Red r2 = r1.getColor();
			System.out.println(r2);

		}

	}


