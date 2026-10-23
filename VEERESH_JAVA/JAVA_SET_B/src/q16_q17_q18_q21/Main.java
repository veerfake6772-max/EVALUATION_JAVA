package q16_q17_q18_q21;

class Emp implements Cloneable{
	int id;
	String name;
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Deleted Successfully");
	}
}

public class Main {
public static void main(String[] args) throws CloneNotSupportedException {
	
	int id = 10;
	System.out.println(id);
	Integer integer = new Integer(id);
	System.out.println(integer);
	int a = integer;
	System.out.println(a);
	
	
	Emp emp = new Emp(1, "Veer");
	System.out.println(emp);
	Emp emp2 = (Emp) emp.clone();
	System.out.println(emp2);
	emp2 = null;
	System.gc();
	
	System.out.println(emp.getClass().getPackageName());
}
}
