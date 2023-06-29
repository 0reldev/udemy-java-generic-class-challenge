package dev.lpa;

import java.util.ArrayList;

public class Layer<T extends Mappable> {

    private ArrayList<T> elements;

    public Layer() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T element) {
        this.elements.add(element);
    }

    public void renderLayer() {
        for (T element : elements) {
            element.render();
        }
    }
}
