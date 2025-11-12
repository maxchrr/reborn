package commands;

import util.Writer;

public class GoCommand implements Command {
	
    @Override
    public String getName() {
        return "go";
    }

    @Override
    public String getDescription() {
        return "the GO command is followed by the name of the neighbor location the\n"
        		+ "player wants to go. In case the location exists and the exit can be crossed, the hero\n"
        		+ "goes there, otherwise he stays in the same room. In each case, a display will indicate\n"
        		+ "what happens.";
    }

    @Override
    public void execute(Writer writer, String[] args) {
    	// TODO Auto-generated method stub
    	
    }
}
