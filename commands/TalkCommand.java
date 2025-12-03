package commands;

import core.Hero;
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
		String characterTalkDesc = hero.getLocation().getCharacters().talkInteraction();
		hero.getWriter().display(characterName + "\n" + characterTalkDesc + "\n");
		
		switch(characterName) {
			case "Ghost" :
			case "OldLady" :
			{
				Spell newSpell = hero.getLocation().getSpell();
				hero.addSpell(newSpell);
				hero.getWriter().display("You unlocked the " 
						+ newSpell.getName()
						+ " spell : \n"
						+ newSpell.getDesc() 
						+ "\n");
				break;
			}
		}
	}
}
