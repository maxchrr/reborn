package commands;

import util.Writer;

public class LookCommand implements Command {

	@Override
	public String getName() {
		return "look";
	}

	@Override
	public String getDescription() {
		return "displays a description of the current location if no argument\n"
				+ "is given. In case a list of arguments is provided, a display of all arguments that can\n"
				+ "be observed is given.";
	}

	@Override
	public void execute(Writer writer, String[] args) {
		// TODO Auto-generated method stub

	}

}
