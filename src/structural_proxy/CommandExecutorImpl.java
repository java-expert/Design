package structural_proxy;

public class CommandExecutorImpl implements CommandExecuter {

	@Override
	public void runCommand(String cmd) {
		System.out.println("command executed : "+cmd);

	}

}
