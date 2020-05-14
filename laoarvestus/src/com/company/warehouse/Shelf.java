package com.company.warehouse;

import com.company.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private final String shelfIndex;
    private final List<Product> shelfContent = new ArrayList<>();

    public Shelf(String index) {
        this.shelfIndex = index;
    }

    public String getShelfIndex() {
        return shelfIndex;
    }

    public List<Product> getShelfContent() {
        return shelfContent;
    }

    public void addProduct(Product product){
        shelfContent.add(product);
    }
    
    public Object removeProduct(Product productToRemove){
        for (Product prod : shelfContent){
            if (prod.equals(productToRemove)){
                shelfContent.remove(prod);
                return shelfIndex;
            }
        }
        return null;
    }

    public int getItemCount(Product productToCount){
        int count = 0;
        for (Product prod : shelfContent){
            if (prod.equals(productToCount)){
                count += 1;
            }
        }
        return count;
    }


    @Override
    public String toString() {
        return "Shelf{" +
                "shelfIndex='" + shelfIndex + '\'' +
                ", shelfContent=" + shelfContent +
                '}';
    }
}
