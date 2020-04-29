package com.company;

import java.util.*;

public class ProductTester {

    public static List<Product> addNewProduct(List<Product> products, Vendor vendor){
        Scanner myObj = new Scanner(System.in).useLocale(Locale.US);

        int maxNumber = 1;
        for (Product product : products){
            if (product.getProductNumber() >= maxNumber){
                maxNumber = product.getProductNumber() + 1;
            }
        }
        Integer newProductNumber = maxNumber;
        System.out.println("Enter new product name:");
        String newProductName = myObj.nextLine();
        System.out.println("Enter new product number in stock:");
        Integer newProductStock = myObj.nextInt();
        System.out.println("Enter new product price:");
        Double newProductPrice = myObj.nextDouble();

        Product newProduct = new Product(newProductNumber, newProductName, newProductStock, newProductPrice, vendor);
        products.add(newProduct);

        return products;
    }

    public static void printProducts(List<Product> products){
        for (Product product : products){
            System.out.println(product.toString());
        }
    }

    public static void main(String[] args) {
        Vendor vendor = new Vendor("Reseller CO", "1a, A-street, 123456, AUS", "Ants Ans", "55555555");
        Product product1 = new Product(1, "Mouse", 12, 5.99, vendor);
        Product product2 = new Product(2, "Keyboard", 7, 12.49, vendor);
        Product product3 = new Product(3, "Mousepad", 9, 3.99, vendor);
        Product product4 = new Product(4, "Headphones", 4, 19.99, vendor);
        Product product5 = new DVD(5, "DVD", "DVD Jurassic Park", 5, 5.99, vendor);
        Product product6 = new DVD(6, "DVD", "DVD Jurassic World", 6, 6.49, vendor);

        List<Product> products = new ArrayList<>(Arrays.asList(product1, product2, product3, product4, product5, product6));

        addNewProduct(products, vendor);

        printProducts(products);

    }
}
