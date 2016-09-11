package creational_abstractfactory;

public class PermanentEmployeeFactory implements EmpAbstractFactory {

	@Override
	public EmpBase createEmp() {
		// TODO Auto-generated method stub
		return new PermanentEmployee();
	}

}
