package notsure2;

public class MainTest {

	public static void main(String[] args) {
		Bank b1=BankFactory.getBank(new IciciBankFacory());
		Bank b2=BankFactory.getBank(new SbiBankFacory());
		System.out.println(b1.getBankName());
		System.out.println(b2.getBankName());
	}

}
