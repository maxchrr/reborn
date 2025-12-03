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
		if (args.length < 1) return;
		
		String characterName = args[0];
		LocationBase currentLocation = hero.getLocation();
		if (currentLocation.hasCharacter()) {
			String interaction = currentLocation.getCharacter().talkInteraction();
			hero.getWriter().display(characterName + "\n" + interaction + "\n");
			
			switch(characterName) {
				case "Ghost" :
				case "OldLady" :
				{
					if (hero.getLocation().hasSpell()) {
						Spell newSpell = hero.getLocation().getSpell();
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
	}
}
