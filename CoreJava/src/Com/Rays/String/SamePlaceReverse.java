package Com.Rays.String;

public class SamePlaceReverse {

	public static void main(String[] args) {
		
		String name = "Nikita Shrivas Panwar";

		String[] arr = name.split(" "); // { "Nikita", "Shrivas", "Panwar" };

		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i].length() - 1; j >= 0; j--) {

				System.out.print(arr[i].charAt(j));

			}
			System.out.print(" ");
		}
	}

}
