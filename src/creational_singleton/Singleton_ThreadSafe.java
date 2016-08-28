package creational_singleton;
/*Creational design patterns provide solution to instantiate an object in the best
possible way for specific situations.*/

/*Singleton pattern restricts the instantiation of a class and ensures that only
one instance of the class exists in the java virtual machine.*/

public class Singleton_ThreadSafe {
	private static Singleton_ThreadSafe instance;

	private Singleton_ThreadSafe(){
		
	}
	public void displayHash(){
		System.out.println(this.hashCode());
	}
	static public synchronized Singleton_ThreadSafe getInstance(){
		if(instance==null){
			instance=new Singleton_ThreadSafe();
		}
		return instance;
	}
	public static void main(String[] args) {
		Singleton_ThreadSafe.getInstance().displayHash();
	}

}
