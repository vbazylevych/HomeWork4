import goit.javaonline3.area.Area;
import goit.javaonline3.distance.Distance;
import goit.javaonline3.temperature.Temperature;

import java.util.Scanner;

/**
 * Created by Ler4enko on 01.06.2016.
 */
//What is Runer? Maybe is it Runner? Grammatical errors are not tolerated
//Class should not be in default package
public class Runer {

    public static void main (String[] args){

        Area area = new Area();
        Distance distance = new Distance();
        Temperature temperature = new Temperature();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side");
        double side = input.nextDouble();
        System.out.println("Enter hight");
        double hight = input.nextDouble();

        System.out.println("Triangle area = " + area.countTriangleArea(side, hight));
        System.out.println("Square area = " + area.countSquareArea(2, 5));
        System.out.println("Circle area = " + area.countCircleArea(1));
        System.out.println("From Celsii to Faringete = " + temperature.fromCelsiiToFaringet(100500));
        System.out.println("From Faringate to Celsii = " + temperature.fromFaringetToCelsii(100500));
        System.out.println("Distance = " + distance.counDistance(0, 5, 0, 5));

    }
}
