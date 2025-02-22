package problem_solving;

/**
 * INPUT = prithiviraj12
 * OUTPUT = 1+2 = 3
 * 
 * STEPS 1. Assume the total of the digit = 0 2. take the length of the String
 * and iterate 3. inside the loop fetch each char value and store 4. check if
 * that char is a digit or not using isDigit() 5. if it is a digit, get the
 * number value and add it to total = total + numericValue
 */

public class NumFromStringAddThem {

	public static void main(String[] args) {
		String input = "Appu123";
		int total = 0;
		int length = input.length();
		
		for (int i = 0; i < length; i++) {
			 
			char character = input.charAt(i);
			if (Character.isDigit(character)) {
				total = total + Character.getNumericValue(character);

			}
		}
		System.out.println(total);
	}
}
