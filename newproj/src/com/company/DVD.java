package com.company;

public class DVD extends Product{

    private String title;

    public DVD(Integer productNumber, String productName, String title, Integer numberInStock, Double price, Vendor vendor) {
        super(productNumber, productName, numberInStock, price, vendor);
        this.title = title;
    }

    @Override
    public Double calculateInventoryValue() {
        return super.calculateInventoryValue() * 1.05;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "title='" + title + '\'' +
                ", inventoryValue + restocking fee=" + calculateInventoryValue() +
                '}';
    }
}
