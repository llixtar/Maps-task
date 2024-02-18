package app.model;

import java.util.Objects;

public class AppProductModel {

    private final String model;

    private final String color;
    private final int count;
    private final double price;

    public AppProductModel(String model, String color, int count, double price) {
        this.model = model;
        this.color = color;
        this.count = count;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppProductModel that = (AppProductModel) o;
        return count == that.count && Double.compare(price, that.price) == 0 && Objects.equals(model, that.model) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, count, price);
    }

    @Override
    public String toString() {
        return "Model: " + model +
                ". Color: " + color +
                ". Count: " + count +
                ". Price: " + price + " USD.";
    }
}
