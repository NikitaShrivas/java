package Com.Rays.Const;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.setColor("orange");
		s.setBorderWidth(10);

		Shape s2 = new Shape("Blue", 100);

		s2.setColor("Pink");

		System.out.println(s2.getColor());

		System.out.println(s2.getBorderWidth());
	}

	}


