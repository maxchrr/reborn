package commands;

import util.Writer;

public class QuitCommand implements Command {

	@Override
	public String getName() {
		return "quit";
	}

	@Override
	public String getDescription() {
		return "quit the game.";
	}

	@Override
	public void execute(Writer writer, String[] args) {
		writer.display("Goodbye!");
		System.exit(0);
	}

}
