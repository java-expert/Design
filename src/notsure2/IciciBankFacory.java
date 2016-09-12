package notsure2;

public class IciciBankFacory implements BankAbstractFactory {

	@Override
	public Bank createBank() {
		// TODO Auto-generated method stub
		return new IciciBank();
	}

}
