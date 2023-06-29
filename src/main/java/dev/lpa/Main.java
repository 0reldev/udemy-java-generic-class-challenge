package dev.lpa;

public class Main {

    public static void main(String[] args) {

        // parks
        Park yellowstone = new Park("Yellowstone", new Location(44.4882, -110.5916));
        Park grandCanyon = new Park("Grand Canyon", new Location(36.0636, -112.1079));
        Park yosemite = new Park("Yosemite", new Location(37.8855, -119.5360));

        Layer<Park> parks = new Layer<>();
        parks.addElement(yellowstone);
        parks.addElement(grandCanyon);
        parks.addElement(yosemite);

        parks.renderLayer();

        // rivers
        River mississippi = new River("Mississippi");
        mississippi.addLocation(new Location(47.2130, -95.2348));
        mississippi.addLocation(new Location(35.1556, -90.0659));
        mississippi.addLocation(new Location(29.1566, -89.2495));

        River missouri = new River("Missouri");
        missouri.addLocation(new Location(45.9239, -111.4983));
        missouri.addLocation(new Location(38.8146, -90.1218));

        River colorado = new River("Colorado");
        colorado.addLocation(new Location(40.4708, -105.8286));
        colorado.addLocation(new Location(36.1015, -112.0892));
        colorado.addLocation(new Location(34.2964, -114.1148));
        colorado.addLocation(new Location(31.7811, -114.7724));

        River delaware = new River("Delaware");
        delaware.addLocation(new Location(42.2026, -75.00836));
        delaware.addLocation(new Location(39.4955, -75.5592));

        Layer<River> rivers = new Layer<>();
        rivers.addElement(mississippi);
        rivers.addElement(missouri);
        rivers.addElement(colorado);
        rivers.addElement(delaware);

        rivers.renderLayer();
//        Render Yellowstone National Park as POINT ([44.4882, -110.5916])
//        Render Grand Canyon National Park as POINT ([36.0636, -112.1079])
//        Render Yosemite National Park as POINT ([37.8855, -119.536])
//        Render Mississippi River as LINE ([[47.213, -95.2348], [35.1556, -90.0659], [29.1566, -89.2495]])
//        Render Missouri River as LINE ([[45.9239, -111.4983], [38.8146, -90.1218]])
//        Render Colorado River as LINE ([[40.4708, -105.8286], [36.1015, -112.0892], [34.2964, -114.1148], [31.7811, -114.7724]])
//        Render Delaware River as LINE ([[42.2026, -75.00836], [39.4955, -75.5592]])
    }
}
