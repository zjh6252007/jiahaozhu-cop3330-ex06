/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */
import java.time.Year;
import java.util.Scanner;

public class retirement {
    public static void main(String[] args) {
        System.out.println("What is your current age?");
        Scanner scan = new Scanner(System.in);
        String readAge = scan.nextLine();
        int age = Integer.valueOf(readAge);
        System.out.println("At what age would you like to retire?");
        String readRetire = scan.nextLine();
        int retire = Integer.valueOf(readRetire);
        int remainAge = retire - age;

        Year y = Year.now();
        int year = Integer.valueOf(String.valueOf(y));
        System.out.println("You have " + remainAge +"years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in" + (year + remainAge));
    }
}
