package q8;

import java.util.Vector;

import q8.Emp;

public class Main {
	public static void main(String[] args) {
		Vector<Emp> emps = new Vector<Emp>();
		Emp emp = new Emp(1,"Veer");
		
		Emp emp2 = new Emp(2,"Ram");

		Emp emp3 = new Emp(3,"Harsh");
	

		operations operations = new operations_implementor();
		operations.add(emps);
		operations.search(1);
	}
}
