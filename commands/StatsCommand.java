package commands;

import core.Hero;

public class StatsCommand implements Command {

	@Override
	public String getName() {
		return "STATS";
	}

	@Override
	public String getDescription() {
		return "Get the statistics of the Hero.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		hero.getWriter().display("Health: " + hero.getHealth());
		hero.getWriter().display("Mana: " + hero.getMana());
		hero.getWriter().display("Bag: " + (hero.hasBag() ? "yes" : "no"));
	}

}
