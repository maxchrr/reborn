package locations;

public class Exit {
	private final Location target;
	private boolean accessible;
	
	public Location getTarget() {
		return this.target;
	}
	
	public boolean isAccessible() {
		return this.accessible;
	}
	
	public void changeStateOpen() {
		this.accessible = true;
	}
	
	public void changeStateClosed() {
		this.accessible = false;
	}
	
	public Exit(Location target) {
		this.target = target;
		changeStateOpen();
	}
}
