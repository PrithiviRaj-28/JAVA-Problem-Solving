package problem_solving;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReversString {

	public void Buffer() {// using a Stringbuffer method

		String name = "Goku";
		StringBuffer b = new StringBuffer();
		b.append(name);
		System.out.println(b.reverse());
	}

	public void normal() {// using a normal method

		String name = "Verna";
		String rev = "";
		char[] c = name.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		System.out.println(rev);
	}

	public void Collection() {// using collections method
		String d="BEN";
		char[] array=d.toCharArray();
		List<Character> n = new ArrayList<>();

		for (Character c : array) {
			n.add(c);
		}

		Collections.reverse(n);
		ListIterator it = n.listIterator();

		while (it.hasNext()) {
			System.out.print(it.next());
		}

	}

	public static void main(String[] args) {

		ReversString R = new ReversString();
		R.Buffer();
		R.normal();
		R.Collection();

	}

}
