package notsure1;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equals("Shape"))
			return new ShapeFactory();
		else if(choice.equals("Printer"))
				return new PrinterFactory();
		return null;
	}

}
