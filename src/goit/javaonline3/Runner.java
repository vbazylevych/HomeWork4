package goit.javaonline3;

import goit.javaonline3.area.Area;
import goit.javaonline3.distance.Distance;
import goit.javaonline3.temperature.Temperature;
import java.util.Scanner;

/**
 * Created by Ler4enko on 01.06.2016.
 */
public class Runner {

    public static void main (String[] args){

        Area area = new Area();
        Distance distance = new Distance();
        Temperature temperature = new Temperature();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side");
        double side = input.nextDouble();//
        // тут, конечно, нужно бы делать проверку ввели ли целое число, потому как иначе получаем ошибку.
        //можно будет потом к этой задачке вернуться и доделать :)
        System.out.println("Enter hight");
        double hight = input.nextDouble();

        System.out.println("Triangle area = " + area.countTriangleArea(side, hight));
        //здесь что-то вычисляется, но если в код не смотреть - не понятно что. Можно указать все данные в выводеЖ
        //"Площадь круга с радиусом 1 равно столько-то"
        System.out.println("Square area = " + area.countSquareArea(2, 5));
        System.out.println("Circle area = " + area.countCircleArea(1));
        System.out.println("From Celsii to Faringete = " + temperature.fromCelsiiToFaringet(100500));
        System.out.println("From Faringate to Celsii = " + temperature.fromFaringetToCelsii(100500));
        System.out.println("Distance = " + distance.counDistance(0, 5, 0, 5));
        //как на счет обрезать вывод до двух знаков после запятой? Для красоты

    }
}