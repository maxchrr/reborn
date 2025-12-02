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
		hero.getWriter().display("Year : 3625" 
				+ "Destination : NEUTRA\r\n"
				+ "Population : unknown \r\n"
				+ "That's it, you feel quite anxious, thus you are more curious than ever to discover what happened."
				+ "Everyone seems to have disappear and you have one objective : find the reason and, if you can, fin them back.");
	}

}
