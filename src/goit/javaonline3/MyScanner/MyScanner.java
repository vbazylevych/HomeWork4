package goit.javaonline3.myscanner;

import java.util.Scanner;

/**
 * Created by Ler4enko on 22.06.2016.
 */
public class MyScanner {
    private static Scanner scanner = new Scanner(System.in);

    public void closeScanner() {
        scanner.close();
    }

    public int getPositiveInt() {
        int PositiveInt = 0;

        while(true) {
            PositiveInt = getInt();
            if (PositiveInt < 0) {
                System.out.println("You enter value less or equal 0. Please try again.");
            } else {
                return PositiveInt;
            }
        }
    }

    public int getInt() {
        int userInput = 0;

        while(true) {

            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();
                break;
            } else {
                System.out.println("You entered incorrect value. Please try again");
                scanner.next();
            }
        }
        return userInput;
    }

    public double getPositiveDouble() {
        double PositiveDouble = 0;

        while(true) {
            PositiveDouble = getDouble();
            if (PositiveDouble < 0) {
                System.out.println("You enter value less or equal 0. Please try again.");
            } else {
                return PositiveDouble;
            }
        }
    }

    public double getDouble() {
        double userInput = 0;

        while(true) {

            if (scanner.hasNextDouble()) {
                userInput = scanner.nextDouble();
                break;
            } else {
                System.out.println("You entered incorrect value. Please try again");
                scanner.next();
            }
        }
        return userInput;
    }
}
