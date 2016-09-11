package creational_abstractfactory;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpBase obj1=EmpFactory.getEmp(new PermanentEmployeeFactory());
		EmpBase obj2=EmpFactory.getEmp(new ContractEmployeeFactory());
		System.out.println(obj1.getEmpType());
		System.out.println(obj2.getEmpType());

	}

}
