package goit.javaonline3.area;

import java.util.InputMismatchException;

/**
 * Created by Ler4enko on 01.06.2016.
 */
public class Area {

    public static double countTriangleArea (double side, double height) {
        if(side <= 0 || height <= 0) {
            throw new InputMismatchException();
        }
        return (0.5 * side * height);
    }

    public static double countSquareArea(double side, double height) {
        return (side * height);
    }

    public static double countCircleArea(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }
}

/*
Что если в методы countSquareArea() и  countCircleArea() передадут или отрицательное число?

Полезно было бы обьявить, что метод throws InputMismatchException.
Тогда мы будем видеть это в сигнатуре метода, при его вызове. Предупрежден - значит вооружен.

Перед тем, как бросить ошибку, можно вывести что-то полезное, например "вы передали отрицательную сторону треугольника"

*/
