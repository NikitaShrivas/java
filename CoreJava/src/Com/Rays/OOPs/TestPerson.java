package Com.Rays.OOPs;

public class TestPerson {

	public static void main(String[] args) {
      Person p = new Person();

		p.setName("Nikita");
		p.setDob(null);
		p.setAddress("Indore");

		System.out.println(p.getName());

		System.out.println(p.getDob());

		System.out.println(p.getAddress());
	}

}
