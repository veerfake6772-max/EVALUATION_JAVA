package q27_q29;

class Emp{
	int id = 1;
	String name = "Veer";
	static double salary= 50000;
	
	void showInfo() {
	System.out.println(id);
	System.out.println(name);
	}
	static void displayInfo() {
		System.out.println(salary);
	}
	//q-29
	void data() {
		String address = "Dahisar"; 
		System.out.println(address);
	}
	
	class ContactDetails{ 
		final double phone = 35272282;
		final String email = "veer@gmail.com";
		
		void showDetail() {
			System.out.println(phone);
			System.out.println(email);
		}
	}
}
public class Main {
public static void main(String[] args) {
	Emp emp = new Emp();
	emp.showInfo();
	
	System.out.println(Emp.salary);
	Emp.displayInfo();
	
	emp.data();
	
	Emp.ContactDetails contactDetails = emp.new ContactDetails();
	contactDetails.showDetail();
	
	
	
}
}
