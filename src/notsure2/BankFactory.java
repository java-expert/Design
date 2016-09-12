package notsure2;

public class BankFactory {
	public static Bank getBank(BankAbstractFactory b){
	 return b.createBank();	
	}

}
