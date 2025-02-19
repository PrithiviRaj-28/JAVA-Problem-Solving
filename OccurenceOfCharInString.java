package problem_solving;

public class OccurenceOfCharInString {
	public void iteration() { // using iteration

		String name = "Leodass";
		char find = 'S';
		int occurence = 0;

		name = name.toUpperCase();
		System.out.println(name);

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == find) {
				occurence = occurence + 1;
			}
		}
		System.out.println(occurence);
	}

	public void Noiteration() { // using without iteration
		
		/*convert the input to a uniform formate
		 * find the length of the actual input
		 * replace the to fint char with empty string
		 * find the length after replacing 
		 * occuranec = actualLength - length after replacing  */
		
		String name = "priThiViraj";
		char input = 'i';
		name = name.toLowerCase();

		String tofind = Character.toString(input).toLowerCase();

		int ActualLength = name.length();
		name = name.replace(tofind, "");
		int length = name.length();

		System.out.println(ActualLength - length);

	}

	public static void main(String[] args) {
		OccurenceOfCharInString oc = new OccurenceOfCharInString();
		// oc.iteration();
		oc.Noiteration();

	}
}
