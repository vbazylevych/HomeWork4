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
        // Захардкодженные данные это плохо - надо дописать ввод из клавиатуры для всех параметров
        System.out.println("Square area with side = 2.0 and height = 5.0 is " + String.format("%.2f", Area.countSquareArea(2, 5)));
        System.out.println("Circle area with radius 1 is " + String.format("%.2f", Area.countCircleArea(1)));
        System.out.println("100500 degrees from Celsius to Fahrenheit is "
                + String.format("%.2f", Temperature.fromCelsiusToFahrenheit(100500)));
        System.out.println("100500 degrees from Fahrenheit to Celsius is " + String.format("%.2f", Temperature.fromFahrenheitToCelsius(100500)));
        System.out.println("Distance between (0;0) and (0;5) = " + String.format("%.2f", Distance.countDistance(0, 0, 0, 5)));
    }
}

//beatween, incorect - grammar mistakes

//Проверки на 0 все еще нет и более того, площадь треугольнка со сторой или высотой 0 равна 20.