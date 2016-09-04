package creational_factory1UsingBaseInterface;

public class EmpFactory {
	public static EmpInterface getEmployee(String s){
		if(s.equals("P"))
			return new PermanentEmployee();
		else if(s.equals("C")){
			return new ContractEmployee();
		}
		return null;
	}

}
