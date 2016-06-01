import goit.javaonline3.area.Area;
import goit.javaonline3.distance.Distance;
import goit.javaonline3.temperature.Temperature;

/**
 * Created by Ler4enko on 01.06.2016.
 */
public class Runer {

    public static void main (String[] args){

        Area area = new Area();
        Distance distance = new Distance();
        Temperature temperature = new Temperature();

        System.out.println("Triangle area = " + area.countTriangleArea(2, 3));
        System.out.println("Square area = " + area.countSquareArea(2, 5));
        System.out.println("Circle area = " + area.countCircleArea(1));
        System.out.println("From Celsii to Faringete = " + temperature.fromCelsiiToFaringet(100500));
        System.out.println("From Faringate to Celsii = " + temperature.fromFaringetToCelsii(100500));
        System.out.println("Distance = " + distance.counDistance(0, 5, 0, 5));

    }
}
