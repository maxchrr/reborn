package commands;

import util.Writer;

public class StartCommand implements Command {

	@Override
	public String getName() {
		return "start";
	}

	@Override
	public String getDescription() {
		return "start the game.";
	}

	@Override
	public void execute(Writer writer, String[] args) {
		writer.display("It's cold and still inside the spaceship. As you land, "
				+ "everything seems lifeless, a grey fog covers March, the before "
				+ "known capital of Vow.");
	}

}
