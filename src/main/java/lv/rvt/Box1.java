package lv.rvt;

import java.util.ArrayList;

public class Box1 implements Packable{
    private double maxWeight;
    private ArrayList<Packable> items;

    public Box1(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= maxWeight) {
            items.add(item);
        } else {
            System.out.println("Cannot add item. Max weight exceeded.");
        }
    }

    public double weight() {
        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
