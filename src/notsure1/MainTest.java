package notsure1;

public class MainTest {

	public static void main(String[] args) {
		AbstractFactory sf=FactoryProducer.getFactory("Printer");
		Printer p1=sf.getPrinter("P");
		p1.print();
		
		Printer p2=sf.getPrinter("W");
		p2.print();
		
		AbstractFactory sf1=FactoryProducer.getFactory("Shape");
		Shape s1=sf1.getShape("S");
		s1.draw();
		
		Shape s2=sf1.getShape("R");
		s2.draw();
		

	}

}
