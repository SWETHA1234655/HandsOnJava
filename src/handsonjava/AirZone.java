package handsonjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AirZone {
    private String name;
    private List<Aircraft> aircrafts;

    public AirZone(String name) {
        this.name = name;
        this.aircrafts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public void addAircraft(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }

    public void removeAircraft(Aircraft aircraft) {
        this.aircrafts.remove(aircraft);
    }

    public void sortAircraftsBySpeed() {
        Collections.sort(this.aircrafts, Comparator.comparingDouble(Aircraft::getSpeed));
    }

    @Override
    public String toString() {
        return "AirZone{" +
                "name='" + name + '\'' +
                ", aircrafts=" + aircrafts +
                '}';
    }
}