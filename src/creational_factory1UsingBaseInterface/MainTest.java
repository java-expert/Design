package creational_factory1UsingBaseInterface;

public class MainTest {
	public static void main(String[] args) {
		EmpInterface emp= EmpFactory.getEmployee("C");
		System.out.println(emp.getEmpType());
		
		EmpInterface emp1= EmpFactory.getEmployee("P");
		System.out.println(emp1.getEmpType());
	}

}
