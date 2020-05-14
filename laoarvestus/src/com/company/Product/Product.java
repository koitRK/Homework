package com.company.product;

public class Product {
    private String productName;
    private Integer productSize;

    public Product(String productName, Integer productSize) {
        this.productName = productName;
        this.productSize = productSize;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductSize() {
        return productSize;
    }

    public void setProductSize(Integer productSize) {
        this.productSize = productSize;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + productName.hashCode();
        result = 31 * result + productSize;
        return result;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        else if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final Product other = (Product) object;

        return (this.productName.equals(other.productName) && this.productSize.equals(other.productSize));
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productSize=" + productSize +
                '}';
    }
}
