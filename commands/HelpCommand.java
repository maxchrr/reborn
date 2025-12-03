package commands;

import core.Hero;

public class HelpCommand implements Command {
	private final CommandManager manager;
	
	public HelpCommand(CommandManager manager) {
		this.manager = manager;
	}

	@Override
	public String getName() {
		return "HELP";
	}

	@Override
	public String getDescription() {
		return "Indicates the set of availaible commands.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		// Case: HELP -> list all commands
		if (args.length == 0) {
            hero.getWriter().display("Available commands:");
            
            for (Command cmd : manager.getCommands().values()) {
                hero.getWriter().display(
                		" - " + cmd.getName() + " : " + cmd.getDescription()
                );
            }
            return;
        }
		
		// Case: HELP <command> -> detailed help
		String cmdName = args[0].toLowerCase();
		Command cmd = manager.getCommands().get(cmdName);
            if (cmd != null) {
                hero.getWriter().display(
                		"\nCommand: " + cmd.getName() +
                		"\nDescription: " + cmd.getDescription() + "\n"
                );
            } else {
                hero.getWriter().display("Unknown command: " + cmdName);
            }
	}
}
