package commands;

import util.Writer;

/**
 * Represents a single console command.
 */
public interface Command {
	/** The name used to call the command (e.g., "help"). */
    String getName();

    /** A short description of what the command does. */
    String getDescription();

    /** Executes the command with any provided arguments. */
	void execute(Writer writer, String[] args);
}
