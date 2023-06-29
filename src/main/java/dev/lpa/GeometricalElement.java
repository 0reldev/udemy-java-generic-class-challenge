package dev.lpa;

public abstract class GeometricalElement implements Mappable {

    protected String name;
    protected String type;

    public GeometricalElement(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract String print();

    @Override
    public void render() {
        System.out.println("Render " + name + " " + type + " as " + print());
    }
}