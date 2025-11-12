package commands;

import util.Writer;

public class HelpCommand implements Command {
	private final CommandManager manager;
	
	public HelpCommand(CommandManager manager) {
		this.manager = manager;
	}

	@Override
	public String getName() {
		return "help";
	}

	@Override
	public String getDescription() {
		return "indicates the set of availaible commands.";
	}

	@Override
	public void execute(Writer writer, String[] args) {
		if (args.length == 0) {
            // List all commands
            System.out.println("Available commands:");
            for (Command cmd : manager.getCommands().values()) {
                System.out.printf(" - %-10s : %s%n", cmd.getName(), cmd.getDescription());
            }
        } else {
            // Show detailed help for one command
            String cmdName = args[0].toLowerCase();
            Command cmd = manager.getCommands().get(cmdName);
            if (cmd != null) {
                System.out.printf("%nCommand: %s%nDescription: %s%n", cmd.getName(), cmd.getDescription());
            } else {
                System.out.println("Unknown command: " + cmdName);
            }
        }
	}

}
