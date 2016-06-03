package goit.javaonline3.area;
//лишняя строка

/**
 * Created by Ler4enko on 01.06.2016.
 */
public class Area {
    // Methods are separated by a blank line
    //http://www.oracle.com/technetwork/java/codeconventions-150003.pdf
    public double countTriangleArea(double side, double height){
        return (0.5 * side * height);
    }
    public double countSquareArea(double side, double hight){
        return (side * hight);
    }
    public double countCircleArea(double radius) {
        return (Math.PI * Math.pow(radius,2));
    }
}
