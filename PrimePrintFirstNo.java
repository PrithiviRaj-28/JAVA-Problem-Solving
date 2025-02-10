package problem_solving;

public class PrimePrintFirstNo {

	public static void main(String[] arg) {
		int num = 10;
		
		for (int i = 2; i <= num; i++) {
			boolean isprime = true;
			
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isprime = false;
					//break;
				}
			}
			
			if (isprime) {
				System.out.println(i + " is prime");
				System.out.println(isprime);
			}
		}
	}
}
