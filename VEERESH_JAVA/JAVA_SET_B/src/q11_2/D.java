package q11_2;
import q11_1.A;
public class D {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.b);
	}
}

class E extends A{
	public static void main(String[] args) {
		 E e = new E();
		 System.out.println(e.b);
		 System.out.println(e.c);
	}
}