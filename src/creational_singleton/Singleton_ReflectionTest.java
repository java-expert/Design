package creational_singleton;
/*Creational design patterns provide solution to instantiate an object in the best
possible way for specific situations.*/

/*Singleton pattern restricts the instantiation of a class and ensures that only
one instance of the class exists in the java virtual machine.*/

public class Singleton_ReflectionTest {
	private static final Singleton_ReflectionTest instance=new Singleton_ReflectionTest();

	private Singleton_ReflectionTest(){
		
	}
	public void displayHash(){
		System.out.println(this.hashCode());
	}
	static public Singleton_ReflectionTest getInstance(){
		return instance;
	}
	public static void main(String[] args) {
		Singleton_ReflectionTest.getInstance().displayHash();
	}

}
