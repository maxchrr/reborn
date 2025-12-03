package commands;

import core.Hero;
<<<<<<< HEAD
import spells.Spell;
=======
>>>>>>> 80d0d43acbe1aec01582d8cdaf592eb30c64fa3c

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
<<<<<<< HEAD
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
=======
		// TODO Auto-generated method stub

	}

>>>>>>> 80d0d43acbe1aec01582d8cdaf592eb30c64fa3c
}
