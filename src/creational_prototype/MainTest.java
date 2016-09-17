package creational_prototype;

public class MainTest {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.loadEmp();
		
		Employee e2=e1.clone();
		
		System.out.println(e1.getEmpList());
		System.out.println(e2.getEmpList());
	}

}
