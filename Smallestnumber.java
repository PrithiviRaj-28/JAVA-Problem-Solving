package problem_solving;

import java.util.*;
import java.util.List;

public class Smallestnumber {
	
	Integer[] arr = { 5, 8, 2, 3, 7 };

	public void mod1() {
		int small = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("Small num is : " + small);
	}

	public void usingArr() {// using Arrays method
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

	public void coll() {// using collections method
		List<Integer> li = Arrays.asList(arr);
		Collections.sort(li);
		int small = li.get(0);
		System.out.println(small);
	}

	public static void main(String[] args) {
		Smallestnumber s = new Smallestnumber();
		// s.mod1();
		// s.usingArr();
		   s.coll();
	}
}
