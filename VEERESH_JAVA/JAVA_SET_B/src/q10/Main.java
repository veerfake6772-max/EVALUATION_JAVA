package q10;
class Outer{
	final int id =10;

	void methOuter() {
		class Inner{
			void methInner() {
				System.out.println(id);
			}
		}Inner i = new Inner();
		i.methInner();

		
	}
}

public class Main {
public static void main(String[] args) {
	Outer outer = new Outer();
	outer.methOuter();
}
}
