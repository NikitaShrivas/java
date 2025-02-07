package Com.Rays;

public class TestIncDecOperator {

	public static void main(String[] args) {
	
		int i = 1;

		 int sum = i++ + i + ++i + --i;
		// 1 + 2 + 3 + 2      out put is 8

	     //int sum = i++ + i++ + i++ + i++ + i++;
		// 1 + 2 + 3 + 4 + 5 = 15        out put is 15

		//int sum = --i + --i + --i + --i + --i;  
		// 0 + -1 + -2 + -3 + -4      out put id -10

		//int sum = i-- + i + ++i + i++ + i + --i;
		//        1   + 0 +   1 + 1   + 2 +   1     out put is 6

		System.out.println("sum: " + sum);

	}

}
