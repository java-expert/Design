package creational_factoryUsingBaseInterface;

public class PlanFactory {
	PlanInterface getPlan(String planType){
		if(planType.equals("P")){
			return new PersonalPlan();
		} else if(planType.equals("C")){
			return new CorporatePlan();
		}
		return null;
	}
}
