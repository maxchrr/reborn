package core;

import locations.*;

public class World {
    public Spaceship spaceship;
    public Street1 street1;
    public Pub pub;
    
    public Location startingLocation;

    public World() {
        spaceship = new Spaceship();
        street1   = new Street1();
        pub       = new Pub();

        spaceship.addExit(street1);

        street1.addExit(spaceship);
        street1.addExit(pub);

        pub.addExit(street1);

        startingLocation = spaceship;
    }
}
