package locations;

public class Exit {
	private final LocationBase TARGET;
	private boolean accessible;
	
	public LocationBase getTarget() {
		return this.TARGET;
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
	
	public Exit(LocationBase target) {
		this.TARGET = target;
		changeStateOpen();
	}
	
	public Exit(LocationBase target, boolean state) {
		this.TARGET = target;
		this.accessible = state;
	}
}
