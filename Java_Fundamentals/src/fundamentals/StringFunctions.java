package fundamentals;

public class StringFunctions {

	public static void main(String[] args) {
		/*
		 * String channelName = "Smart Classroom";
		System.out.println(channelName);
		
		String newChannel = new String("Universal");
		*/
		
		// == and .equals()
		
		String s1 = new String("Learning Strings");
		String s2 = new String("Learning Strings");
		
		//System.out.println(s1==s2);
		//System.out.println(s1.equals(s2));
		
		//immutability
		
		String name = new String("  LEARNING JAVA  ");
		String nameL =name.toLowerCase();
		System.out.println(nameL);
		
		// Important String Methods
		
		int length= name.length();
		System.out.println(length);
		
		System.out.println(name.substring(0, 8));
		System.out.println(name.equalsIgnoreCase(nameL));
		
		System.out.println(name);
		
		
	}

}
