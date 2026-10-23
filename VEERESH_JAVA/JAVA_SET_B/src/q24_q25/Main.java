package q24_q25;
class Institute{
	
	void schoolStaff(double salary, double tax) {
		System.out.println(salary -tax);
	}
	void schoolStaff(double bonus) {
		System.out.println(bonus);
	}
}
class School extends Institute{
	@Override
	void schoolStaff(double bonus) {
		// TODO Auto-generated method stub
		System.out.println(bonus);
	}
	@Override
	void schoolStaff(double salary, double tax) {
		// TODO Auto-generated method stub
		System.out.println(salary- tax);
	}
	
}
public class Main {
public static void main(String[] args) {
	Institute institute= new Institute();
	School school = new School();
	institute.schoolStaff(500);
	institute.schoolStaff(25000, 100);
	school.schoolStaff(10000, 1000);
	school.schoolStaff(100);
}
}
