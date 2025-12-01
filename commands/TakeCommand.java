package commands;

import core.Hero;

public class TakeCommand implements Command {

	@Override
	public String getName() {
		return "TAKE";
	}

	@Override
	public String getDescription() {
		return "Add (if possible) the argument to the hero’s items.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		// TODO Auto-generated method stub

	}

}
