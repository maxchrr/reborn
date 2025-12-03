package commands;

import core.Hero;
import locations.LocationBase;
import spells.Spell;

public class TalkCommand implements Command {

	@Override
	public String getName() {
		return "TALK";
	}

	@Override
	public String getDescription() {
		return "Talk to a character.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		if (args.length == 0) return;
		
		String inputName = args[0];
		String normalizedName =
				inputName.substring(0, 1).toUpperCase() +
				inputName.substring(1).toLowerCase();
		
		LocationBase currentLocation = hero.getLocation();
		if (!currentLocation.hasCharacter()) return;
		
		// Show character's dialogue
		String interaction = currentLocation.getCharacter().talkInteraction();
		hero.getWriter().display(normalizedName + ": " + interaction);
		
		// Characters that give a spell
		switch(inputName.toUpperCase()) {
			case "GHOST" :
			case "OLDLADY" :
				if (currentLocation.hasSpell()) {
					Spell newSpell = currentLocation.getSpell();
					hero.addSpell(newSpell);
					hero.getWriter().display("You unlocked the " 
							+ newSpell.getName()
							+ " spell : \n"
							+ newSpell.getDesc() 
							+ "\n");
				}
				break;
		}

	}
}
