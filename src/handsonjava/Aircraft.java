package handsonjava;

class Aircraft {
    private String name;
    private double speed;
    private double altitude;

    public Aircraft(String name, double speed, double altitude) {
        this.name = name;
        this.speed = speed;
        this.altitude = altitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", altitude=" + altitude +
                '}';
    }
}