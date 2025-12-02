package locations;

public class Exit {
	private final BaseLocation TARGET;
	private boolean accessible;
	
	public BaseLocation getTarget() {
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
	
	public Exit(BaseLocation target) {
		this.TARGET = target;
		changeStateOpen();
	}
}
