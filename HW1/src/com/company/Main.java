package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter radius: ");
        double radius = input.nextInt();

        System.out.println(String.format("Square area given radius %s is %s", radius, Geometry.squareAreaGivenRadius(radius)));
        System.out.println(String.format("Square perimeter given radius %s is %s", radius, Geometry.squarePerimeterGivenRadius(radius)));
        System.out.println(String.format("Circle area given radius %s is %s", radius, Geometry.circleAreaGivenRadius(radius)));
        System.out.println(String.format("Circle circumference given radius %s is %s", radius, Geometry.circleCircumferenceGivenRadius(radius)));


        System.out.println("\nPress ENTER to increase salaries");
        try{System.in.read();}
        catch(Exception e){}

        double [] salaries = {750, 500, 1100, 975, 1200};

        double [] newSalaries = Salary.raiseMultiple(salaries);

        System.out.print("\nEnter temperature: ");
        double temperature = input.nextInt();

        Temperature.temperatureFeel(temperature);

    }
}
