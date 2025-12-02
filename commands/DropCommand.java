package commands;

import core.Hero;
import items.Bag;
import items.Item;

public class DropCommand implements Command {

    @Override
    public String getName() {
        return "DROP";
    }

    @Override
    public String getDescription() {
        return "Drop an item from your bag.";
    }

    @Override
    public void execute(Hero hero, String[] args) {
        if (args.length < 1) return;
        
        if (!hero.hasBag()) {
            hero.getWriter().display("I don't have a bag.");
            return;
        }
        
        String itemName = args[0];
        Bag heroBag = hero.getBag();
        var locItems = hero.getLocation().getItems();
        Item found = null;
        
        if (itemName.equalsIgnoreCase("Bag")) {
            boolean allowed = heroBag.onDrop(hero, hero.getLocation());
            if (allowed) locItems.add(heroBag);
 
            return;
        }

        for (Item item : heroBag.getItems()) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                found = item;
                break;
            }
        }

        if (found == null) {
            hero.getWriter().display("I don't have this item in my bag.");
            return;
        }

        boolean allowed = found.onDrop(hero, hero.getLocation());

        if (allowed) {
        	heroBag.removeItem(found);
        	locItems.add(found);
        }
    }
}
