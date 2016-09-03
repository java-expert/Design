package creational_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
		Singleton_ReflectionTest obj1=Singleton_ReflectionTest.getInstance();
		Singleton_ReflectionTest obj2=Singleton_ReflectionTest.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		Singleton_ReflectionTest obj3=null;
		Constructor[] constructors =Singleton_ReflectionTest.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			//Below code will destroy the singleton pattern
			constructor.setAccessible(true);
			try {
				obj3=(Singleton_ReflectionTest) constructor.newInstance(null);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(obj3.hashCode());
		}
		
	}

}
