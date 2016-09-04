package creational_factory;

public class PlanFactory {
	Plan getPlan(String planType){
		if(planType.equals("P")){
			return new PersonalPlan();
		} else if(planType.equals("C")){
			return new CorporatePlan();
		}
		return null;
	}
}
