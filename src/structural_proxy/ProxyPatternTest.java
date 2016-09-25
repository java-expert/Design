package structural_proxy;

public class ProxyPatternTest {
	public static void main(String[] args) {
		CommandExecuter ce=new CommandExecutorProxy("123", "eee");
		try {
			ce.runCommand("ls");
			ce.runCommand("rm");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
