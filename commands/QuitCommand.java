package commands;

import core.Hero;

public class QuitCommand implements Command {

	@Override
	public String getName() {
		return "QUIT";
	}

	@Override
	public String getDescription() {
		return "Quit the game.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		hero.getWriter().display("Goodbye!");
		System.exit(0);
	}

}
