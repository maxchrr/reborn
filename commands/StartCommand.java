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
<<<<<<< HEAD
		hero.getWriter().display("Year : 3625\n" 
				+ "Destination : NEUTRA \n"
				+ "Population : unknown \n"
				+ "That's it, you feel quite anxious, thus you are more curious than ever to discover what happened.\n"
				+ "Everyone seems to have disappear and you have one objective : find the reason and, if you can, fin them back.\n");
=======
		hero.getWriter().display("Year : 3625" 
				+ "Destination : NEUTRA\r\n"
				+ "Population : unknown \r\n"
				+ "That's it, you feel quite anxious, thus you are more curious than ever to discover what happened."
				+ "Everyone seems to have disappear and you have one objective : find the reason and, if you can, fin them back.");
>>>>>>> 80d0d43acbe1aec01582d8cdaf592eb30c64fa3c
	}

}
