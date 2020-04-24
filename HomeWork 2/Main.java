package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random r = new Random();

    static Integer target;
    static Double balance = 0.0;
    static Integer prize = 1000000;
    static String userInput;
    static Integer guess;
    static Boolean menu = false;

    static void changeTarget(){
        target = r.nextInt( 1000001);
    }

    static void quitGame(){
        System.out.println("Quitting game");
        if (balance < 0){
            System.out.println(String.format("You lost $%s. Thanks for playing. Come again!", -balance));
        }
        else{
            System.out.println(String.format("You won $%s. Thanks for playing. Come again!", balance));
        }
    }

    public static void main(String[] args) {

        changeTarget();
        //System.out.println(target);

        System.out.println("\nWant to win a million dollars?\n" +
                "If so, guess the winning number (a number between 0 and 100000).\n");

        while (true){
            if (!menu){
                System.out.println("Insert $1.00 and enter your number or 'q' to quit:");
            }

            userInput = scanner.nextLine();

            if (userInput.equals("q")){
                quitGame();
                break;
            }
            else if (!menu){
                try{
                    guess = Integer.parseInt(userInput);
                    if (guess < target || guess > target){
                        System.out.println("Sorry, good guess, but not quite right. Do you want me to give you a hint (y|n)?");
                        menu = true;
                        balance -= 1;
                    }
                    else{
                        System.out.println("YOU WIN!");
                        balance += prize;
                        quitGame();
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid value");
                }
            }
            else{
                if (userInput.equals("y")){
                    if (guess < target){
                        System.out.println("Your number is too low!");
                    }
                    else{
                        System.out.println("Your number is too high!");
                    }
                    balance -= 2;
                    menu = false;
                }
                else if (userInput.equals("n")){
                    menu = false;
                }
                else{
                    System.out.println("Invalid value\nDo you want me to give you a hint (y|n)?");
                }
            }
        }
    }
}
