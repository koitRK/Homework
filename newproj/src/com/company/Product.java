package com.company;

public class Product {

    private Integer productNumber;
    private String productName;
    private Integer numberInStock;
    private Double price;
    private Vendor vendor;

    public Product(Integer productNumber, String productName, Integer numberInStock, Double price, Vendor vendor) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.numberInStock = numberInStock;
        this.price = price;
        this.vendor = vendor;
    }


    public Double calculateInventoryValue(){
        return numberInStock * price;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(Integer numberInStock) {
        this.numberInStock = numberInStock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", numberInStock=" + numberInStock +
                ", price=" + price +
                ", inventoryValue=" + calculateInventoryValue() +
                ", vendor=" + vendor +
                '}';
    }
}
