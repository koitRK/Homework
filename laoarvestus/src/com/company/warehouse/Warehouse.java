package com.company.warehouse;

import com.company.product.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warehouse {
    private final List<Shelf> shelves = new ArrayList<>();

    public List<Shelf> getShelves() {
        return shelves;
    }

    Shelf getShelf(String shelfIndex){
        for (Shelf shelf : shelves){
            if (shelf.getShelfIndex().equals(shelfIndex)){
                return shelf;
            }
        }
        Shelf newShelf = new Shelf(shelfIndex);
        shelves.add(newShelf);
        return newShelf;
    }

    public void receive(Product prod, String loc){
        getShelf(loc).addProduct(prod);
    }

    public String dispatch(Product prod){
        for (Shelf shelf : shelves){
            if (shelf.removeProduct(prod) != null){return shelf.getShelfIndex();}
        }
        return null;
    }

    public int getItemCount(Product prod){
        int productCount = 0;
        for (Shelf shelf : shelves){
            productCount += shelf.getItemCount(prod);
        }
        return productCount;
    }

    public List<List<String>> getContent(){
        List<List<String>> contentList = new ArrayList<>();
        for (Shelf shelf : shelves){
            for (Product product : shelf.getShelfContent()){
                List<String> productInString = Arrays.asList(shelf.getShelfIndex(), product.getProductName(), String.valueOf(product.getProductSize()));
                contentList.add(productInString);
            }
        }
        return contentList;
    }

    public void writeCSV() throws IOException {
        List<List<String>> rows = getContent();

        FileWriter csvWriter = new FileWriter("new.csv");
        csvWriter.append("Shelf");
        csvWriter.append(",");
        csvWriter.append("Product Name");
        csvWriter.append(",");
        csvWriter.append("Product Size");
        csvWriter.append("\n");

        for (List<String> rowData : rows) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();

        System.out.println("CSV file saved!");
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "shelves=" + shelves +
                '}';
    }
}
