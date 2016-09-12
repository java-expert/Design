package notsure1;

public class PrinterFactory extends AbstractFactory{

	@Override
	Printer getPrinter(String type) {
		if(type==null)
			return null;
		if(type.equals("P"))
			return new PaperPrinter();
		else if(type.equals("W"))
			return new WebPrinter();
		return null;
	}

	
	Shape getShape(String shape) {
		// TODO Auto-generated method stub

		return null;
	}

}
