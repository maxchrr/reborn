package commands;

import util.Writer;

public class UseCommand implements Command {

	@Override
	public String getName() {
		return "use";
	}

	@Override
	public String getDescription() {
		return "uses the object arg1. In case a second argument is given, the first\n"
				+ "one is used with the second. For example, use gun bullet may load the gun, which\n"
				+ "can be used after that.";
	}

	@Override
	public void execute(Writer writer, String[] args) {
		// TODO Auto-generated method stub

	}

}
