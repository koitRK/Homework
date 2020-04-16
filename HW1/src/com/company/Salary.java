package com.company;

public class Salary {

    public static int maxApplicableSalary = 1000;

    public static double raise(double currentSalary){
        if (currentSalary <= maxApplicableSalary){
            double newSalary = currentSalary * 1.05;
            System.out.println(String.format("Salary increased from $%s to $%s", currentSalary, newSalary));
            return newSalary;
        }
        else{
            System.out.println(String.format("Salary of $%s is not eligible for a raise. Highest applicable salary is $%s", currentSalary, maxApplicableSalary));
            return currentSalary;
        }
    }

    public static double [] raiseMultiple(double [] currentSalaries){
        double [] newSalaries = new double[currentSalaries.length];

        for (int i = 0; i < currentSalaries.length; i++){
            newSalaries[i] = raise(currentSalaries[i]);
        }
        return newSalaries;
    }

}
