package q28;

class Emp{
	String name;
	int id;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Main {
public static void main(String[] args) {
	Emp emp = new Emp();
	emp.setId(1);
	emp.setName("Veer");
	emp.setSalary(50000);
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getSalary());
}
}
