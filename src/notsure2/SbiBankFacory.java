package notsure2;

public class SbiBankFacory implements BankAbstractFactory {

	@Override
	public Bank createBank() {
		// TODO Auto-generated method stub
		return new SbiBank();
	}

}
