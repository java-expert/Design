package creational_singleton;
/*Creational design patterns provide solution to instantiate an object in the best
possible way for specific situations.*/

/*Singleton pattern restricts the instantiation of a class and ensures that only
one instance of the class exists in the java virtual machine.*/

public class Singleton_DoubleLockingStaticBlock {
	private static Singleton_DoubleLockingStaticBlock instance;

	private Singleton_DoubleLockingStaticBlock(){
		
	}
	public void displayHash(){
		System.out.println(this.hashCode());
	}
	static public Singleton_DoubleLockingStaticBlock getInstance(){
		if(instance==null){
			synchronized(Singleton_DoubleLockingStaticBlock.class){
				if(instance==null){
					instance=new Singleton_DoubleLockingStaticBlock(); 	
				}
				
			}
			
		}
		return instance;
	}
	public static void main(String[] args) {
		Singleton_DoubleLockingStaticBlock.getInstance().displayHash();
	}

}
