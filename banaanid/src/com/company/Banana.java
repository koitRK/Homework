package com.company;

abstract class Banana {
    double weight;
    int ripeness;
    String type;
    double price;

    int shelfLife() {
        return 10 - ripeness;
    }

    double calculatePrice(){
        if (weight > 0.2){
            return Math.round(weight * price * shelfLife() * 0.95 * 100.0) / 100.0;
        }
        else{
            return Math.round(weight * price * shelfLife() * 100.0) / 100.0;
        }
    }

    @Override
    public String toString() {
        return "Banana{" +
                "weight=" + weight +
                ", ripeness=" + ripeness +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

