package com.company;

public class Temperature {

    public static double coldTemp = 10;
    public static double hotTemp = 25;

    public static String temperatureFeel(double temp){

        if (temp > hotTemp){
            System.out.println(String.format("%s°C is HOT!", temp));
            return "HOT!";
        }
        else if (temp < coldTemp){
            System.out.println(String.format("%s°C is COLD!", temp));
            return "COLD!";
        }
        else{
            System.out.println(String.format("%s°C is WARM!", temp));
            return "WARM!";
        }

    }
}
