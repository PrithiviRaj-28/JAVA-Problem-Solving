package problem_solving;
//import java.lang.;
import java.util.*;

/**
 * 1. pangram -> if a given statement is having all the english alphabets
 * 
 * input = 'a'
 * output = b to z
 * 
 * STEPS
 * 1. convert the string to a uniform case (lower / upper)
 * 2. remove the space if there's any 
 * 3. store the input into a string array
 * 4. create a string array with english alphabets 
 * 5. create two hashsets, one with user input and other with alphabets 
 * 6. compare the two sets and find the missing characters
 *
 * **/
public class PangramMissingAlphabet {

	public static void main(String[ ] args) {
		String given = "a";
		given=given.toLowerCase();
		given = given.replaceAll(" ", "");
		
		String[] useArr = given.split("");
		String [] alphabets ="abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet <String> set1 = new HashSet<String>(Arrays.asList(useArr));		
		
		/*  for(String s : useArr){
			  set1.add(s);
			  }*/		 
		
		HashSet<String> set2 = new HashSet<>(Arrays.asList(alphabets));
		set2.removeAll(set1);
		System.out.println(set2);
		

		
	}
}
