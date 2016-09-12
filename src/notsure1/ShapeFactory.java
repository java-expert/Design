package notsure1;

public class ShapeFactory extends AbstractFactory{

	@Override
	Printer getPrinter(String type) {
		return null;
	}

	
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape==null)
			return null;
		if(shape.equals("S"))
			return new Square();
		else if(shape.equals("R"))
			return new Rectangle();
		return null;
	}

}
