package problem_solving;
import java.util.*;

public class ReversNumber {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int given =sc.nextInt();
		int rev =0;
		
		while(given != 0) {
			rev = rev *10;
			rev = rev+given%10;
			given = given /10;
			
		}
		System.out.println(rev);
	}

}
