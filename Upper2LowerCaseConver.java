package problem_solving;

/**
 * CONVERT UPPER TO LOWER CASE LETTERS & LOWER TO UPPER CASE LETTER 
 * METHODS 
 * 1. Normal buildin functions like toLowerCase() , toUpperCase() 
 * 2.custom logic 
 * -> input = "HELLO BOYS" 
 * -> convert it to CharArrays 
 * -> find the length of the char array 
 * -> iterate using a loop until the length 
 * -> inside loop take each character and check if its ASCII value is in between 65(A) and 90(Z) 
 * -> if it is , add 32 to it.ASCII value ->a-z(97-122) 
 * -> then store it in the char[i]
 * -> after the loop , iterate and print the chars
 */

public class Upper2LowerCaseConver {

	public void toLower() {
		//to convert lowerCase
		String input = "HELLO BOYS";
		char[] charArr = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {

			if (charArr[i] >= 65 && charArr[i] <= 90) {
				charArr[i] = (char) (charArr[i] + 32);
			}
		}
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i]);

		}		
	}
	
	public void toUpper() {
		String input = "happy new year";
		char [] charArr = input.toCharArray();
		System.out.println(charArr[2]==112);
		
			for(int i=0;i<input.length();i++) {
				if(charArr[i] >= 97 && charArr[i] >= 122) {
					charArr[i]=(char)(charArr[i]-32);
				}
			}
			for(int i = 0; i < charArr.length; i++) {
				System.out.print(charArr[i]);
			}
	}
	public static void main(String[] args) {
		Upper2LowerCaseConver u =new Upper2LowerCaseConver();
		u.toUpper();
		//u.toLower();
	}
}
