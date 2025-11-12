package commands;

import util.Writer;

public class TalkCommand implements Command {

	@Override
	public String getName() {
		return "talk";
	}

	@Override
	public String getDescription() {
		return "talk to a character.";
	}

	@Override
	public void execute(Writer writer, String[] args) {
		// TODO Auto-generated method stub

	}

}
