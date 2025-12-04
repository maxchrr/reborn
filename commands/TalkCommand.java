package commands;

import characters.Character;
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
		LocationBase currentLocation = hero.getLocation();
		if (!currentLocation.hasCharacter()) {
            hero.getWriter().display("There's nobody to talk to here.");
            return;
        }
		
		Character character = currentLocation.getCharacter();
		String characterName = character.getName().toUpperCase();
		
		if (!inputName.equalsIgnoreCase(characterName)) {
			hero.getWriter().display("There's no one named " + inputName + " here.");
			return;
		}
		
		hero.getWriter().display(character.getName() + ": " + character.talkInteraction());
		
		// Characters that give a spell
		if ((inputName.equals("GHOST") || inputName.equals("OLDLADY")) && currentLocation.hasSpell()) {
			Spell newSpell = currentLocation.getSpell();
			hero.learn(newSpell);
			hero.getWriter().display("You unlocked the " + newSpell.getName() + " spell: " + newSpell.getDesc());
		}

	}
}
