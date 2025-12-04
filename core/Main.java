package core;

import java.util.Scanner;

import commands.*;
import locations.*;
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
		manager.register(new AttackCommand());
		manager.register(new DropCommand());
        manager.register(new GoCommand());
        manager.register(new HelpCommand(manager));
        manager.register(new LookCommand());
        manager.register(new QuitCommand());
        manager.register(new StartCommand());
        manager.register(new TakeCommand());
        manager.register(new TalkCommand());
        manager.register(new UseCommand());

        writer.debug("Command handler ready");
        
        // Initialize the World
        World world = new World();
        LocationBase currentLocation = world.startingLocation;
        
        writer.debug("World ready");
        
        // Initialize the Hero on starting location
        Hero hero = new Hero(writer, 100, 100, currentLocation, false, null);
        
        writer.debug("Hero ready");
        
        writer.display("Welcome to our incredible Java game!");
		writer.display("Enter 'START' to start this awesome aventure");

		// Main command loop
        while (true && hero.getHealth() > 0) {
            System.out.print("> ");
            String input = scanner.nextLine();
            manager.handle(writer, hero, input);
        }
        
        hero.getWriter().display("Game over.");
	}
}
