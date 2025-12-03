package locations;

import java.util.Map;

/**
 * Represents a single location.
 */
public interface Location {
	/** The name used of the location (e.g., "Spaceship"). */
    String getName();
    
    /** A short description of the location. */
    String getDescription();
    
    /** A dictionary of all the possible Exits */
    Map<String, Exit> getExits();
}