package creational_builder;

public class Computer {
	//required
	private String hdd;
	
	private String processor;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHdd() {
		return hdd;
	}
	public String getProcessor() {
		return processor;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	private Computer(ComputerBuilder cb){
		this.hdd=cb.hdd;
		this.processor=cb.processor;
		this.isBluetoothEnabled=cb.isBluetoothEnabled;
		this.isGraphicsCardEnabled=cb.isGraphicsCardEnabled;
	}
	
	public static class ComputerBuilder{
		private String hdd;
		
		private String processor;
		
		//optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hdd, String processor){
			this.hdd=hdd;
			this.processor=processor;
		}
		
		public ComputerBuilder setGraphicsCardEnabled(boolean
				isGraphicsCardEnabled) {
				this.isGraphicsCardEnabled = isGraphicsCardEnabled;
				return this;
				}
				public ComputerBuilder setBluetoothEnabled(boolean
				isBluetoothEnabled) {
				this.isBluetoothEnabled = isBluetoothEnabled;
				return this;
				}
				public Computer build(){
				return new Computer(this);
				}
		
	}
	
	public static void main(String[] args) {
		Computer c=new Computer.ComputerBuilder("1tb", "processor").setBluetoothEnabled(true).build();
		System.out.println(c.getHdd()+c.getProcessor()+c.isBluetoothEnabled+c.isGraphicsCardEnabled);
	}
}

/*
Guidelines for Builder design pattern in Java
1) Make a static nested class called Builder inside the class whose object will be build by Builder. In this example its Cake.

2) Builder class will have exactly same set of fields as original class.
3) Builder class will expose method for adding optional parametrs 
each method will return same Builder object. 
Builder will be enriched with each method call.

4) Builder.build() method will copy all builder field values into actual class and return object of Item class.
5) Item class (class for which we are creating Builder) should have private constructor to create its object from build() method and prevent outsider to access its constructor

Read more: http://javarevisited.blogspot.com/2012/06/builder-design-pattern-in-java-example.html#ixzz4JxkYlfOe
http://javarevisited.blogspot.in/2012/06/builder-design-pattern-in-java-example.html
*/