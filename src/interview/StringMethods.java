package interview;

public class StringMethods {
	public static void main(String[] args) {
		String s= "                 Welcome to Greens   Technologies";
		String s1 ="welcome to green technologies";
		int compareTo = s.compareTo(s1);
	System.out.println(compareTo);
	
	boolean equals = s.equals(s1);
	System.out.println(equals);
	String trim = s.trim();
	System.out.println(trim);
	String[] split = s.split(s);
	System.out.println(split);
	int lastIndexOf = s.lastIndexOf("e");
	System.out.println(lastIndexOf);
	}
}
