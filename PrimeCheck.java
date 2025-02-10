package problem_solving;
import java.util.*;

public class PrimeCheck {
		//to check prime numbers
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int no =sc.nextInt();		
		int count = 0;

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				count++;
			}
		}

		if (count == 0) System.out.println(no + " its prime");
		else System.out.println(no + " its not a prime");
		
	}
}
