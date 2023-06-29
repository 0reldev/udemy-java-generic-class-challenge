package dev.lpa;

public class Point extends GeometricalElement implements Mappable{

    private Location location;

    public Point(String name, String type, Location location) {
        super(name, type);
        this.location = location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String print() {
        return this.getClass().getSuperclass().getSimpleName().toUpperCase() + " ([" + location.getLatitude() + ", " + location.getLongitude() + "])";
    }
}