package com.company;

public class IndiaBanana extends Banana{

    private final int curve;

    public IndiaBanana(double weight, int ripeness, int curve) {
        if(ripeness>10 || ripeness<5)
        {
            throw new IllegalArgumentException("ripeness for India Banana should be in the range of [5-10].");
        }
        if(curve>45 || curve<0)
        {
            throw new IllegalArgumentException("curve should be in the range of [0-45].");
        }
        super.weight = weight;
        super.ripeness = ripeness;
        super.type = "India";
        super.price = 1.89;
        this.curve = curve;
    }

    public double getWeight() {
        return weight;
    }

    public int getRipeness() {
        return ripeness;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getCurve() {
        return curve;
    }

    @Override
    public String toString() {
        return "IndiaBanana{" +
                "weight=" + weight +
                ", ripeness=" + ripeness +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", curve=" + curve +
                ", unit price=" + calculatePrice() +
                '}';
    }
}