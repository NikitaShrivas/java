package Com.Rays;

public class TestPrimeNumber {

	public static void main(String[] args) {
		
		int number = 4;

		int count = 0;

		for (int i = 2; i < number; i++) {
        // if we use 2 then it is not prime number 
		// and if we use 3 then it will be prime number (else will be execute).
			
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}

	}

}
