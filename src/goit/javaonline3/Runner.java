package goit.javaonline3;

import goit.javaonline3.myscanner.MyScanner;
import goit.javaonline3.area.Area;
import goit.javaonline3.distance.Distance;
import goit.javaonline3.temperature.Temperature;

/**
 * Created by Ler4enko on 01.06.2016.
 */
class Runner {

    public static void main (String[] args){

        MyScanner input = new MyScanner();

        System.out.println("Enter triangle side:");
        double side = input.getPositiveDouble();
        System.out.println("Enter triangle height:");
        double height = input.getPositiveDouble();
        System.out.println("Triangle area with side = " + side + " and height = "+ height + " is "
                    + String.format("%.2f", Area.countTriangleArea(side, height))+ "\n");

        System.out.println("Enter square side:");
        side  = input.getPositiveDouble();
        System.out.println("Enter square height:");
        height = input.getPositiveDouble();

        System.out.println("Square area with side = " + side + " and height = "+ height + " is "
                + String.format("%.2f", Area.countSquareArea(side, height)) + "\n");
        System.out.println("Enter circle radius:");
        double radius  = input.getPositiveDouble();
        System.out.println("Circle area with radius " + radius +" is "
                + String.format("%.2f", Area.countCircleArea(radius)) + "\n");

        System.out.println("Enter Celsius degrees:");
        double celsius = input.getDouble();
        System.out.println(celsius +" degrees from Celsius to Fahrenheit is "
                + String.format("%.2f", Temperature.fromCelsiusToFahrenheit(celsius)) + "\n");

        System.out.println("Enter Fahrenheit degrees:");
        double fahrenheit = input.getDouble();
        System.out.println(fahrenheit + " degrees from Fahrenheit to Celsius is "
                + String.format("%.2f", Temperature.fromFahrenheitToCelsius(fahrenheit)) + "\n");

        System.out.println("Enter x for first dot:");
        int x1 = input.getInt();
        System.out.println("Enter y for first dot:");
        int y1 = input.getInt();
        System.out.println("Enter x for second dot:");
        int x2 = input.getInt();
        System.out.println("Enter y for second dot:");
        int y2 = input.getInt();
        System.out.println("Distance between (" + x1+ ";" + y1 + ") and (" + x2 + ";" + y2 + ") = "
                + String.format("%.2f", Distance.countDistance(x1, y1, x2, y2)) + "\n");

        input.closeScanner();
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