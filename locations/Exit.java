package locations;

public class Exit {
	private boolean isAccessible;
	private Location location;
	
	public boolean getState() {
		return this.isAccessible;
	}
	
	public Location getLocation() {
		return this.location;
	}
	
	public void changeStateOpen() {
		this.isAccessible = true;
	}
	
	public void changeStateClosed() {
		this.isAccessible = false;
	}	
}
