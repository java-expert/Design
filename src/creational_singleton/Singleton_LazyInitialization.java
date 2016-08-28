package creational_singleton;
/*Creational design patterns provide solution to instantiate an object in the best
possible way for specific situations.*/

/*Singleton pattern restricts the instantiation of a class and ensures that only
one instance of the class exists in the java virtual machine.*/

public class Singleton_LazyInitialization {
	private static Singleton_LazyInitialization instance;

	private Singleton_LazyInitialization(){
		
	}
	public void displayHash(){
		System.out.println(this.hashCode());
	}
	static public Singleton_LazyInitialization getInstance(){
		if(instance==null){
			instance=new Singleton_LazyInitialization();
		}
		return instance;
	}
	public static void main(String[] args) {
		Singleton_LazyInitialization.getInstance().displayHash();
	}

}
