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
