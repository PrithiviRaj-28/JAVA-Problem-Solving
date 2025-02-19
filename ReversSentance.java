package problem_solving;

import java.util.*;

public class ReversSentance {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the senctence : ");
		String word = sc.nextLine();

		String rev = "";
		String[] temp = word.split(" ");

		for (int i = temp.length - 1; i >= 0; i--) {
			rev = rev + temp[i] + " ";
		}
		System.out.println(rev);
	}
}
