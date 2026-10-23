package q8;

import java.util.Vector;

public class operations_implementor implements operations {

	Vector<Emp> db = new Vector<Emp>();

	@Override
	public void add(Vector<Emp> emps) {
		for (Emp emp : emps) {
			db.addAll(emps);
		}

	}

	@Override
	public void update(int id, String name) {
		for (Emp emp : vec) {
			while (emp.getId() == id) {
				emp.setName(name);
			}
		}

	}

	@Override
	public void delete(int id) {
		for (Emp emp : vec) {

		}

	}

	@Override
	public void search(int id) {
		for (Emp emp : vec) {
			if (emp.getId() == id) {
				emp.getName();
			}
		}

	}

	@Override
	public void show() {
		for (Emp emp : vec) {
			
		}
	}
}
