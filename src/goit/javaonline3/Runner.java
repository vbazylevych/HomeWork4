package goit.javaonline3;

import goit.javaonline3.area.Area;
import goit.javaonline3.distance.Distance;
import goit.javaonline3.temperature.Temperature;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ler4enko on 01.06.2016.
 */
class Runner {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter side:");
            double side = input.nextDouble();

            System.out.println("Enter height:");
            double height = input.nextDouble();

            System.out.println("Triangle area with side = " + side + " and height = "+ height + " is "
                    + String.format("2%.2f", Area.countTriangleArea(side, height)));
        } catch (InputMismatchException e) {
            System.out.println("You entered incorrect side or height. Triangle area won't be counted!");
        }

        System.out.println("Square area with side = 2.0 and height = 5.0 is " + String.format("%.2f", Area.countSquareArea(2, 5)));
        System.out.println("Circle area with radius 1 is " + String.format("%.2f", Area.countCircleArea(1)));
        System.out.println("100500 degrees from Celsius to Fahrenheit is "
                + String.format("%.2f", Temperature.fromCelsiusToFahrenheit(100500)));
        System.out.println("100500 degrees from Fahrenheit to Celsius is " + String.format("%.2f", Temperature.fromFahrenheitToCelsius(100500)));
        System.out.println("Distance between (0;0) and (0;5) = " + String.format("%.2f", Distance.countDistance(0, 0, 0, 5)));
//        System.out.println(Area.countTriangleArea(-1, -3));
//        System.out.println(Area.countSquareArea(-5, -4));
//        System.out.println(Area.countCircleArea(-5));
    }
}

/*
Output:
Enter side:
0,6
Enter height:
0,1
Triangle area with side = 0.6 and height = 0.1 is 20,03

mmmm.... something went wrong

раскомментируй стр39-40.
Чему равны площади квадрата и круга с отрицальными параметрами?

*/