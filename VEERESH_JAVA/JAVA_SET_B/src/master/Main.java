package master;

import q1_bonus.Bonus;
import q1_salary.Salary;
import q1_tax.Tax;

public class Main {
	public double calFinal(Salary salary, Bonus bonus, Tax tax) {
		return salary.calSal(0)+ bonus.calBonus(0)-tax.calTax(0);
	}
	
public static void main(String[] args) {
	Main main = new Main();
	System.out.println(main.calFinal(new Salary() {
		@Override
		public double calSal(double sal) {
			// TODO Auto-generated method stub
			return 10000;
		}
	}, new Bonus() {
		@Override
		public double calBonus(double bonus) {
			// TODO Auto-generated method stub
			return 500;
		}
		
	}, new Tax() {
		@Override
		public double calTax(double tax) {
			// TODO Auto-generated method stub
			return 100;
		}
	}));
	
	Salary salary = new Salary() {
		@Override
		public double calSal(double sal) {
			// TODO Auto-generated method stub
			return 20000;
		}
	};
	Bonus bonus = new Bonus() {
		@Override
		public double calBonus(double bonus) {
			// TODO Auto-generated method stub
			return 2000;
		}
	};
	Tax tax = new Tax() {
		@Override
		public double calTax(double tax) {
			// TODO Auto-generated method stub
			return 200l;
		}
	};
	
	System.out.println(main.calFinal(salary, bonus, tax));
	
}
}
