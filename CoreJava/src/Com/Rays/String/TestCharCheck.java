package Com.Rays.String;

public class TestCharCheck {

	public static void main(String[] args) {
		
		String name = "Nikita Panwar";

		char ch = 'a';

		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			
			if (name.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println("count = " + count);
	}

	}


