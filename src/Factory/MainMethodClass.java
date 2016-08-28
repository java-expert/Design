package Factory;

public class MainMethodClass {
	public static void main(String[] args) {
		PlanFactory pf=new PlanFactory();
		Plan cPlan=pf.getPlan("C");
		cPlan.displayPlan();
		
		Plan pPlan=pf.getPlan("P");
		pPlan.displayPlan();
	}

}
