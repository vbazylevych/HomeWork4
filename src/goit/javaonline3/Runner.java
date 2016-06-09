package goit.javaonline3;

import goit.javaonline3.area.Area;
import goit.javaonline3.distance.Distance;
import goit.javaonline3.temperature.Temperature;
import java.util.Scanner;

/**
 * Created by Ler4enko on 01.06.2016.
 */
class Runner {

    public static void main (String[] args){

        Area area = new Area();
        Distance distance = new Distance();
        Temperature temperature = new Temperature();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side");

        if(input.hasNextDouble()){
            double side = input.nextDouble();

            System.out.println("Enter hight");

            if(input.hasNextDouble()){
                double hight = input.nextDouble();

                System.out.println("Triangle area with side = " + side + " and hight = "+ hight + " is "
                        + String.format("2%.2f", area.countTriangleArea(side, hight)));
            }
        }

        System.out.println("Square area with side = 2.0 and hight = 5.0 is " + String.format("%.2f", area.countSquareArea(2, 5)));
        System.out.println("Circle area with radius 1 is " + String.format("%.2f", area.countCircleArea(1)));
        System.out.println("100500 graduces from Celsii to Faringete is " + String.format("%.2f", temperature.fromCelsiusToFahrenheit(100500)));
        System.out.println("100500 graduces from Faringate to Celsii is " + String.format("%.2f", temperature.fromFahrenheitToCelsius(100500)));
        System.out.println("Distance beatween (0;0) and (0;5) = " + String.format("%.2f", distance.counDistance(0, 0, 0, 5)));
    }
}
