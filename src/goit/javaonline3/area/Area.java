package goit.javaonline3.area;

/**
 * Created by Ler4enko on 01.06.2016.
 */
public class Area {

    public static double countTriangleArea(double side, double height) {
        return (0.5 * side * height);
    }

    public static double countSquareArea(double side, double height){
        return (side * height);
    }

    public static double countCircleArea(double radius)
    {
        return (Math.PI * Math.pow(radius, 2));
    }
}

//три метода и во всех по-разному открываются фигурные скобки: без отступа, с отступом, с переносом строки.

//Что если в метод передадут 0 или отрицательное число?