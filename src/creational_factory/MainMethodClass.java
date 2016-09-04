package creational_factory;

public class MainMethodClass {
	public static void main(String[] args) {
		PlanFactory pf=new PlanFactory();
		PlanInterface cPlan=pf.getPlan("C");
		cPlan.displayPlan();
		
		PlanInterface pPlan=pf.getPlan("P");
		pPlan.displayPlan();
	}

}
