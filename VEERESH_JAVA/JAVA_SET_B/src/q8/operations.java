package q8;

import java.util.Vector;

public interface operations {
	Vector<Emp> vec = new Vector<Emp>();

	void add(Vector<Emp> emps);
	void update(int id, String name);
	void delete(int id);
	void search(int id);
	void show();
	
}
