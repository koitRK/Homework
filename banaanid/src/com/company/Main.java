package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Banana> bananas = new ArrayList<>();
        bananas.add(new CavendishBanana(0.21, 3));
        bananas.add(new CavendishBanana(0.28, 6));
        bananas.add(new CavendishBanana(0.17, 8));
        bananas.add(new IndiaBanana(0.21, 5, 13));
        bananas.add(new IndiaBanana(0.32, 8, 29));
        bananas.add(new IndiaBanana(0.26, 10, 15));
        bananas.add(new IndiaBanana(0.12, 6, 41));
        bananas.add(new IndiaBanana(0.16, 7, 1));
        bananas.add(new IndiaBanana(0.20, 5, 20));
        bananas.add(new IndiaBanana(0.18, 9, 33));

        for (Banana banana : bananas){
            System.out.println(banana);
        }

    }
}
