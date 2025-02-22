package problem_solving;

/*
 * 1. using trim 
 * 
 * 2. using strip its support in java11
 * 		-> strip()
 * 		-> stripleading()
 * 		-> stripTrailing()
 * 
 * 3. using regular expression
 * 1. ^[ \t] + | [ \t]+$   = its leading and trailing
 *   -> ^[ \t]+     = leading
 *   -> | [ \t]+$  = trailing
 * */
public class RemoveLeading_TrailingSpace {

		public static void main(String[] args) {
			String str = "  hello boyss !!  ";
			//System.out.println(str.trim());
			//System.out.println(str.strip());
			//System.out.println(str.stripLeading());
			//System.out.println(str.stripTrailing());
			System.out.println(str.replaceAll("^[ \t]+|[ \t]$",""));
			System.out.println(str.replaceAll("^[ \t]+", ""));  //leading
			System.out.println(str.replaceAll(" [ \t]+$", "")); //trailing


		}
}
