package q20;

public class Main {
public static void main(String[] args) {
	String name1 = "Hello";
	String name2 = "  World   ";
	System.out.println(name2.trim());
	System.out.println(name1.toUpperCase());
	System.out.println(name2.toLowerCase());
	System.out.println(name1.concat(name2));
	System.out.println(name1.replace("l", "x"));
	System.out.println(name1.contentEquals(name2));
	System.out.println(name1.equals(name2));
	System.out.println(name1.compareTo(name2));
	System.out.println(name2.length());

}
}
