package problem_solving;

public class VowelWithSpecialChar {
	/*
	 * Replace all vowels with * 1. input ="I miss Anu" 2. convert the given String
	 * to character array 3. calculate the length of the String and iterate 4.
	 * inside the loop , check if the charAt(index)=vowels 5. if its a vowel
	 * character ,assign it with * 6. outside the loop iterate again to print the
	 * char array
	 * 
	 * Another approach : using regular expression 1. use repplaceAll function for
	 * the regex "[AEIOUaeiou]" and replace it with *.
	 * 
	 * CAUTION : if you are replacing it with $, make sure // it used
	 */

	public void method1() {
		
		String input = "i miss mahendras dhoni";
		char[] arr = input.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' || arr[i] == 'a'
				|| arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
			{
				
				arr[i] = '*';
			}
		}

		System.out.println(arr);
	}

	public void method2() {
		String name = "i miss mahendras dhoni";
		String replace = name.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(replace);
	}

	public static void main(String[] args) {
		VowelWithSpecialChar v = new VowelWithSpecialChar();
		// v.method1();
		v.method2();
	}
}
