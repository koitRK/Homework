package com.company;

import java.lang.Math;

public class Geometry {

    public static double squareAreaGivenRadius(double radius){
        return Math.pow(2*radius, 2);
    }

    public static double squarePerimeterGivenRadius(double radius){
        return 8*radius;
    }

    public static double circleAreaGivenRadius(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public static double circleCircumferenceGivenRadius(double radius){
        return 2 * Math.PI * radius;
    }
}
