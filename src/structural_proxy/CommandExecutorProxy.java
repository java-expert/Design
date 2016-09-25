package structural_proxy;

public class CommandExecutorProxy implements CommandExecuter {
	
	private boolean isAdmin;
	private CommandExecuter commandExecutor;

	public CommandExecutorProxy(String user,String password) {
		if(user.equals("pankaj") && password.equals("password")){
			isAdmin=true;
		}
		commandExecutor=new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		if(isAdmin){
			commandExecutor.runCommand(cmd);
		} else if(cmd.contains("rm")){
			throw new Exception("rm cannot be executed from non admin");
		} else{
			commandExecutor.runCommand(cmd);
		}

	}

}
