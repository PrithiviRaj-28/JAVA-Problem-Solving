package problem_solving;

/*
 * STEPS
 * 1. first lets assume the vowel count is 0 
 * 2. change the string to a uniform case
 * 3. take the length of the string 
 * 4. iterate the characters until the length of the string 
 * 5. inside the loop , check if the char is any of the vowel character 
 *     if so increment the count by 1
 * 6. repeat this until no characters are left  
 * */


public class NumOfVowelTheGivenString {

	public static void main(String[] args) {
		
		String input = "prithiViraJ";
		int vowelCount = 0;
		input = input.toLowerCase();
		int length = input.length();
		
		for(int i =0; i<length;i++) {
			if(input.charAt(i)=='a' || input.charAt(i)=='e' ||input.charAt(i)=='i'  
					|| input.charAt(i)=='o'  || input.charAt(i)== 'u')
			{
				vowelCount++;
			}
		}
		System.out.println("your name har "+vowelCount+" vowels");
	}
}
