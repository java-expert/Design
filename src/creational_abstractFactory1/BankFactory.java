package creational_abstractFactory1;

public class BankFactory {
	public static Bank getBank(BankAbstractFactory b){
	 return b.createBank();	
	}

}
