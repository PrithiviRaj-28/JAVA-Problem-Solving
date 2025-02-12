package problem_solving;

public class SwapNum {

	public static void threeVar() {// using 3rd variable
		int a = 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("A " + a);
		System.out.println("b " + b);

	}
	
	public static void twoVar() { //using only two variable
		
		int first =75;                        // formula -> first = first - second // *
		int sec = 38;                                   //second = first + second  //  /
		first = first - sec;							//First = second - second // /
		sec = first + sec;
		first =sec - first;
		
		System.out.println("frist "+first);
		System.out.println("sec "+sec);

	}

	public static void main(String[] args) {
		SwapNum s = new SwapNum();
		//s.threeVar();
		s.twoVar();

	}
}
