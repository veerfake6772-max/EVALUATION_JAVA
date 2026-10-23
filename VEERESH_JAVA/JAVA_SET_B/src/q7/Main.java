package q7;

import java.util.Objects;

class Emp{
	int id;
	String name;
	String address;
	double salary;
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
}
public class Main {

}
