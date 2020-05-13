package com.company;

public class CavendishBanana extends Banana{

    public CavendishBanana(double weight, int ripeness) {
        if(ripeness>10 || ripeness<0)
        {
            throw new IllegalArgumentException("ripeness for Cavendish Banana should be in the range of [0-10].");
        }
        super.weight = weight;
        super.ripeness = ripeness;
        super.type = "Cavendish";
        super.price = 1.39;
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

    @Override
    public String toString() {
        return "CavendishBanana{" +
                "weight=" + weight +
                ", ripeness=" + ripeness +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", unit price=" + calculatePrice() +
                '}';
    }
}
