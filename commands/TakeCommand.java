package commands;

import util.Writer;

public class TakeCommand implements Command {

	@Override
	public String getName() {
		return "take";
	}

	@Override
	public String getDescription() {
		return "add (if possible) the argument to the hero’s items.";
	}

	@Override
	public void execute(Writer writer, String[] args) {
		// TODO Auto-generated method stub

	}

}
