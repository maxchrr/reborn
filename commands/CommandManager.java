package commands;

import java.util.HashMap;
import java.util.Map;

import core.Hero;
import util.Writer;

/**
 * Handles command registration and execution.
 */
public class CommandManager {
	
    private final Map<String, Command> commands = new HashMap<>();
    
    /**
     * Registers a new command.
     * @param command the Command object to register
     */
    public void register(Command command) {
        commands.put(command.getName().toUpperCase(), command);
    }

    /**
     * Executes a command based on user input.
     * @param input the full line typed by the user
     */
    public void handle(Writer writer, Hero hero, String input) {
        if (input == null || input.isBlank()) return;

        String[] parts = input.trim().split("\\s+");
        String commandName = parts[0].toUpperCase();
        
        String[] args = new String[Math.max(0, parts.length - 1)];
        if (args.length > 0) {
        	System.arraycopy(parts, 1, args, 0, args.length);
        }
        
        // Prevent commands before START
        if (!hero.hasStarted() && !commandName.equals("START")) return;

        Command command = commands.get(commandName);
        
        if (command != null) {
            command.execute(hero, args);
        } else {
            writer.debug("Unknown command: " + commandName);
        }
    }
    
    /**
     * Returns all registered commands.
     * Used by HelpCommand.
     */
    public Map<String, Command> getCommands() {
        return commands;
    }
}
