package q30;
class Emp{
	int id;
	String name;
	String address;
	double sal;
	
	public Emp(int id, String name, String address, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}
	
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + ", sal=" + sal + "]";
	}
	
	
	
}

public class Main {
public static void main(String[] args) {
	Emp emp = new Emp(1, "Veer", "Dahisar", 50000);
	System.out.println(emp.id);
	System.out.println(emp.name);
}
}
