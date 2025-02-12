package problem_solving;

import java.util.*;

public class Patterns {

	public void starpattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");

		int NumLine = sc.nextInt();
		int row = 0, col = 0;

		for (row = 0; row < NumLine; row++) {
			for (col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void NumPattern() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		int limit = sc.nextInt();
		
		int startnum = 1;
		int row, col;	

		for (row = 0; row < limit; row++) {
			for (col = 0; col <= row; col++) {
				System.out.print(startnum + " ");
				startnum = startnum + 1;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Patterns p = new Patterns();
		 p.starpattern();
		 p.NumPattern();
	}

}
