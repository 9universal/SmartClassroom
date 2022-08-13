package fundamentals;

public class Operators {

	public static void main(String[] args) {
		// > >= < <= == !=
		//System.out.println(10<2);
		int a = 6;
		int b = 5;
		//System.out.println(a==b); // true
		//System.out.println(a!=b); // false
		//System.out.println(a%b);
		
		// Post-Increment & Pre-Increment
		int i = 10;
		int j = 20 +i++; // first uses the value then increments
		System.out.println(j);
		System.out.println(i);
		
		int k = 5;
		int l = 10 + ++k;
		System.out.println(l);
		
		
		
	}

}
