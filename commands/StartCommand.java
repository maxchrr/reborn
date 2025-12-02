package commands;

import core.Hero;

public class StartCommand implements Command {

	@Override
	public String getName() {
		return "START";
	}

	@Override
	public String getDescription() {
		return "Start the game.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		hero.setStarted(true);
		hero.getWriter().display("It's cold and still inside the spaceship. As you land, "
				+ "everything seems lifeless, a grey fog covers March, the before "
				+ "known capital of Vow.");
	}

}
