package core;

import java.util.Scanner;

import commands.*;
import util.Writer;

/**
 * Entry point of the program.
 * Sets up the command manager and starts the console loop.
 */
public class Main {
	static Writer writer = new Writer();
	static Scanner scanner = new Scanner(System.in);
	static CommandManager manager = new CommandManager();
	
	public static void main(String[] args) {
		// Register commands
        manager.register(new GoCommand());
        manager.register(new HelpCommand(manager));
        manager.register(new LookCommand());
        manager.register(new QuitCommand());
        manager.register(new StartCommand());
        manager.register(new TakeCommand());
        manager.register(new TalkCommand());
        manager.register(new UseCommand());

        writer.debug("Command handler ready.");
        
        writer.display("Welcome to our incredible Java game!");
		writer.display("Enter 'START' to start this awesome aventure");

		// Main command loop
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            manager.handle(writer, input);
        }
	}
}
