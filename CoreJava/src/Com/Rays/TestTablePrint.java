package Com.Rays;

public class TestTablePrint {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.print(i * j + "\t");
				// \t is a jo ki colunm m gape deta hai. 
				
			}
			System.out.println();
			System.out.println();
		}

	}

}
