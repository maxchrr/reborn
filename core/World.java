package core;

import locations.*;

public class World {
    public Spaceship spaceship;
    public MulburryStreet street1;
    public Pub pub;
    public Crossroads crossroads;
    public Motel motel;
    public MotelEntry motelEntry;
    public MotelRoom motelRoom;
    public OrdinaryStreet street2;
    public Kebab kebab;
    public Church church;
    public Alley alley;
    public Diner diner;
    public DinerKitchen dinerKitchen;
    public StrangeOffice strangeOffice;
    public Backrooms backrooms;
    public BrokenAlley brokenAlley;
    public Graveyard graveyard;
    public PoliceStation policeStation;
    public Cell cell;
    public Park park;
    public Highway highway;
    public Tunnel tunnel;
    public River river;
    
    public LocationBase startingLocation;

    public World() {
        spaceship  	  = new Spaceship();
        street1    	  = new MulburryStreet();
        pub        	  = new Pub();
        crossroads 	  = new Crossroads();
        motel         = new Motel();
        motelEntry    = new MotelEntry();
        motelRoom     = new MotelRoom();
        street2       = new OrdinaryStreet();
        kebab         = new Kebab();
        church        = new Church();
        alley         = new Alley();
        diner      	  = new Diner();
        dinerKitchen  = new DinerKitchen();
        strangeOffice = new StrangeOffice();
        backrooms     = new Backrooms();
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
        street1.addExit(crossroads);

        pub.addExit(street1);
        
        crossroads.addExit(street1);
        crossroads.addExit(church);
        crossroads.addExit(street2);
        crossroads.addExit(motel, false);
        
        church.addExit(crossroads);
        
        motel.addExit(crossroads);
        motel.addExit(motelEntry);
        motel.addExit(motelRoom);
        
        motelEntry.addExit(motel);
        
        motelRoom.addExit(motel);
        
        street2.addExit(crossroads);
        street2.addExit(kebab, true, true);
        street2.addExit(alley);
        street2.addExit(brokenAlley);
        
        kebab.addExit(street2);
        
        alley.addExit(street2);
        alley.addExit(diner);
        
        diner.addExit(alley);
        diner.addExit(dinerKitchen);
        diner.addExit(strangeOffice, true, true);
        
        dinerKitchen.addExit(diner);
        
        strangeOffice.addExit(diner);
        strangeOffice.addExit(backrooms, true, true);
        
        backrooms.addExit(strangeOffice, false, true);
        
        brokenAlley.addExit(street2);
        brokenAlley.addExit(policeStation, false);
        brokenAlley.addExit(graveyard, false);
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
