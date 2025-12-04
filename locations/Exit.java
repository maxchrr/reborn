package locations;

public class Exit {
	private final LocationBase TARGET;
	private boolean accessible;
	private boolean hidden;
	
	public LocationBase getTarget() {
		return this.TARGET;
	}
	
	public boolean isAccessible() {
		return this.accessible;
	}
	
	public boolean isHidden() {
		return this.hidden;
	}
	
	public void changeStateOpen() {
		this.accessible = true;
	}
	
	public void changeStateClosed() {
		this.accessible = false;
	}
	
	public void hide() {
		this.hidden = true;
	}
	
	public void show() {
		this.hidden = false;
	}
	
	public Exit(LocationBase target) {
		this.TARGET = target;
		changeStateOpen();
	}
	
	public Exit(LocationBase target, boolean state) {
		this.TARGET = target;
		this.accessible = state;
	}
	
	public Exit(LocationBase target, boolean accessible, boolean hidden) {
		this.TARGET = target;
		this.accessible = accessible;
		this.hidden = hidden;
	}
}
