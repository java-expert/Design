package creational_singleton;
/*Creational design patterns provide solution to instantiate an object in the best
possible way for specific situations.*/

/*Singleton pattern restricts the instantiation of a class and ensures that only
one instance of the class exists in the java virtual machine.*/

public class Singleton_EagerInitialization {
	private static final Singleton_EagerInitialization instance=new Singleton_EagerInitialization();

	private Singleton_EagerInitialization(){
		
	}
	public void displayHash(){
		System.out.println(this.hashCode());
	}
	static public Singleton_EagerInitialization getInstance(){
		return instance;
	}
	public static void main(String[] args) {
		Singleton_EagerInitialization.getInstance().displayHash();
	}

}
