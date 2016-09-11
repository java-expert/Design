package creational_abstractfactory;

public class ContractEmployeeFactory implements EmpAbstractFactory {

	@Override
	public EmpBase createEmp() {
		// TODO Auto-generated method stub
		return new ContractEmployee();
	}

}
