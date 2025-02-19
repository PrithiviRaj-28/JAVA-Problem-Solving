package problem_solving;

import java.util.*;

public class Ascii_Position {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		
		char given = sc.next().charAt(0);		
		given = Character.toLowerCase(given);

		int asci = (int) given;
		System.out.println("Ascii value is :" + asci);

		int position = asci - 96;   // subract the starting asci value-1 EX. a=97 so we sub 96
		System.out.println("position is :" + position);

	}

}
