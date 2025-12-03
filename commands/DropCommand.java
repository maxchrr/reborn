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
        if (args.length == 0) return;
        
        if (!hero.hasBag()) {
            hero.getWriter().display("I don't have a bag.");
            return;
        }
        
        String itemName = args[0];
        Bag heroBag = hero.getBag();
        var locationItems = hero.getLocation().getItems();
        
        // Special case: dropping the bag itself
        if (itemName.equalsIgnoreCase("Bag")) {
            if (heroBag.onDrop(hero, hero.getLocation())) {
            	locationItems.add(heroBag);
            }
            return;
        }

        // Find the item in the bag
        Item itemToDrop = null;
        for (Item item : heroBag.getItems()) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                itemToDrop = item;
                break;
            }
        }

        if (itemToDrop == null) {
            hero.getWriter().display("I don't have this item in my bag.");
            return;
        }

        if (itemToDrop.onDrop(hero, hero.getLocation())) {
        	heroBag.removeItem(itemToDrop);
        	locationItems.add(itemToDrop);
        }
    }
}
