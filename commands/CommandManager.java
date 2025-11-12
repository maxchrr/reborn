package commands;

import java.util.HashMap;
import java.util.Map;

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
        commands.put(command.getName().toLowerCase(), command);
    }

    /**
     * Executes a command based on user input.
     * @param input the full line typed by the user
     */
    public void handle(Writer writer, String input) {
        if (input == null || input.isBlank()) return;

        String[] parts = input.trim().split("\\s+");
        String name = parts[0].toLowerCase();
        String[] args = new String[Math.max(0, parts.length - 1)];
        System.arraycopy(parts, 1, args, 0, args.length);

        Command command = commands.get(name);
        if (command != null) {
            command.execute(writer, args);
        } else {
            writer.debug("Unknown command: " + name);
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
