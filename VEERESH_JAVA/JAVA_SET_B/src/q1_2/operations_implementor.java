package q1_2;

import q1.SalPolicy;

public class operations_implementor  implements SalPolicy{

	@Override
	public double  calSal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}

	@Override
	public double calBonus(double bonus) {
		// TODO Auto-generated method stub
		return bonus;
	}

	@Override
	public double calTax(double tax) {
		// TODO Auto-generated method stub
		return tax;
	}

}
