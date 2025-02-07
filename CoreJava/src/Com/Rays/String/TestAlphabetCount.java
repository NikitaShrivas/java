package Com.Rays.String;

public class TestAlphabetCount {
	public static void main(String[] args) {

		String name = "Nikita Shrivas";

		int count = 0;

		for (char ch = 'a'; ch <= 'm'; ch++) {

			for (int i = 0; i < name.length(); i++) {

				if (ch == name.charAt(i)) {
					count++;
				
					//System.out.println(name);
				}
				
			}

			if (count != 0) {
				System.out.println(ch + " count = " + count);
			}
			count = 0;
		
}
}
}