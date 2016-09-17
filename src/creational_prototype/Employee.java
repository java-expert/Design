package creational_prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	
	private List<String> empList;
	
	public Employee(){
		empList=new ArrayList<String>();
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	public void loadEmp(){
		empList.add("emp1");
		empList.add("emp2");
		
	}
	
	public Employee(List<String> empList){
		this.empList=empList;
		
	}
	public Employee clone(){
		List<String> temp=new ArrayList<String>();
		for(String s:empList){
			temp.add(s);
		}
		return new Employee(temp);
		
	}
	
}
