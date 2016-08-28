package creational_singleton;
/*Creational design patterns provide solution to instantiate an object in the best
possible way for specific situations.*/

/*Singleton pattern restricts the instantiation of a class and ensures that only
one instance of the class exists in the java virtual machine.*/

public class Singleton_StaticBlockInitialization {
	private static Singleton_StaticBlockInitialization instance;

	private Singleton_StaticBlockInitialization(){
		
	}
	
	static{
		try{
		instance=new Singleton_StaticBlockInitialization();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void displayHash(){
		System.out.println(this.hashCode());
	}
	static public Singleton_StaticBlockInitialization getInstance(){
		return instance;
	}
	public static void main(String[] args) {
		Singleton_StaticBlockInitialization.getInstance().displayHash();
	}

}
