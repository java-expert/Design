package creational_abstractfactory;



public class EmpFactory {
	public static EmpBase getEmp(EmpAbstractFactory e){
		return e.createEmp();
	}

}
