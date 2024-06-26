package handsonjava;

public class AirZoneManagement {
	 public static void main(String[] args) {
	        // Create air zone
	        AirZone airZone = new AirZone("Air Zone 1");

	        // Create aircrafts
	        Aircraft aircraft1 = new Aircraft("Aircraft 1", 500, 10000);
	        Aircraft aircraft2 = new Aircraft("Aircraft 2", 600, 12000);
	        Aircraft aircraft3 = new Aircraft("Aircraft 3", 400, 8000);

	        // Add aircrafts to air zone
	        airZone.addAircraft(aircraft1);
	        airZone.addAircraft(aircraft2);
	        airZone.addAircraft(aircraft3);

	        // Sort aircrafts by speed
	        airZone.sortAircraftsBySpeed();

	        // Print air zone
	        System.out.println(airZone);
	    }

}
