package core;

import locations.*;

public class World {
    public Spaceship spaceship;
    public Street1 street1;
    public Pub pub;
    public Crossroads crossroads;
    public Motel motel;
    public MotelEntry motelEntry;
    public MotelRoom motelRoom;
    public Street2 street2;
    public Church church;
    public Alley alley;
    public Diner diner;
    public DinerKitchen dinerKitchen;
    public BrokenAlley brokenAlley;
    public Graveyard graveyard;
    public PoliceStation policeStation;
    public Cell cell;
    public Park park;
    public Highway highway;
    public Tunnel tunnel;
    public River river;
    
    public Location startingLocation;

    public World() {
        spaceship  	  = new Spaceship();
        street1    	  = new Street1();
        pub        	  = new Pub();
        crossroads 	  = new Crossroads();
        motel         = new Motel();
        motelEntry    = new MotelEntry();
        motelRoom     = new MotelRoom();
        street2       = new Street2();
        church        = new Church();
        alley         = new Alley();
        diner      	  = new Diner();
        dinerKitchen  = new DinerKitchen();
        brokenAlley   = new BrokenAlley();
        graveyard     = new Graveyard();
        policeStation = new PoliceStation();
        cell          = new Cell();
        park       	  = new Park();
        highway       = new Highway();
        tunnel        = new Tunnel();
        river         = new River();

        spaceship.addExit(street1);

        street1.addExit(spaceship);
        street1.addExit(pub);

        pub.addExit(street1);
        
        crossroads.addExit(street1);
        crossroads.addExit(church);
        crossroads.addExit(street2);
        crossroads.addExit(motel);
        
        motel.addExit(crossroads);
        motel.addExit(motelEntry);
        motel.addExit(motelRoom);
        
        motelEntry.addExit(motel);
        
        motelRoom.addExit(motel);
        
        street2.addExit(crossroads);
        street2.addExit(alley);
        street2.addExit(brokenAlley);
        
        church.addExit(crossroads);
        
        alley.addExit(street2);
        alley.addExit(diner);
        
        diner.addExit(dinerKitchen);
        diner.addExit(alley);
        
        dinerKitchen.addExit(diner);
        
        brokenAlley.addExit(street2);
        brokenAlley.addExit(policeStation);
        brokenAlley.addExit(graveyard);
        brokenAlley.addExit(park);
        
        policeStation.addExit(brokenAlley);
        policeStation.addExit(cell);
        
        cell.addExit(policeStation);

        graveyard.addExit(brokenAlley);
        
        park.addExit(brokenAlley);
        park.addExit(highway);
        park.addExit(tunnel);
        park.addExit(river);
        
        highway.addExit(park);
        
        tunnel.addExit(park);
        
        river.addExit(park);
        
        
        startingLocation = spaceship;
    }
}
