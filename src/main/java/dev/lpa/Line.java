package dev.lpa;

import java.util.ArrayList;

public class Line extends GeometricalElement implements Mappable {

    private ArrayList<Location> locations;

    public Line(String name, String type) {
        super(name, type);
        locations = new ArrayList<>();
    }

    public void addLocation(Location location) {
        if (location != null) this.locations.add(location);
    }

    @Override
    public String print() {
        String stringToPrint = super.getClass().getSuperclass().getSimpleName().toUpperCase() + " ([";
        boolean firstLine = true;
        for (Location location : locations) {
            if (!firstLine) stringToPrint+= ", ";
            else firstLine = false;
            stringToPrint += "[" + location.getLatitude() + ", " + location.getLongitude() + "]";
        }
        stringToPrint += "])";
        return stringToPrint;
    }
}
