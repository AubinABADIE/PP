import Types.ArrayOf;
import Types.Boolean;
import Types.Integer;

public class Test {

	public static void main(String[] args) {
		
		Integer a = new Integer();
		System.out.println(a);
		ArrayOf b = new ArrayOf(a);
		System.out.println(b);
		ArrayOf c = new ArrayOf(b);
		System.out.println(c);
		Boolean d = new Boolean();
		System.out.println(d);
		
	}

}
