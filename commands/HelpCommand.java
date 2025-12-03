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
		if (args.length == 0) {
            // List all commands
            hero.getWriter().display("Available commands:");
            for (Command cmd : manager.getCommands().values()) {
                hero.getWriter().display(String.format(" - %-10s : %s%n", cmd.getName(), cmd.getDescription()));
            }
        } else {
            // Show detailed help for one command
            String cmdName = args[0].toLowerCase();
            Command cmd = manager.getCommands().get(cmdName);
            if (cmd != null) {
                hero.getWriter().display(String.format("%nCommand: %s%nDescription: %s%n", cmd.getName(), cmd.getDescription()));
            } else {
                hero.getWriter().display("Unknown command: " + cmdName);
            }
        }
	}
}
