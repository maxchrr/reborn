package items;

public class HpPotion extends ItemBase {

	@Override
	public String getName() {
		return "HpPotion";
	}

	@Override
	public String getDescription() {
		return "A potion that completely restores your health.";
	}
}
