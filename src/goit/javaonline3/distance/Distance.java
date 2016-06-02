package goit.javaonline3.distance;

/**
 * Created by Ler4enko on 01.06.2016.
 */
public class Distance {

    public double counDistance(double x1, double x2, double y1, double y2){//counDistance - добавь одну букву - и читаться будет на много лучше
        //если бы понадобилось вводить координаты точек вручную - это было бы не удобно.
        //нам привычнее вводить (x1, y1), (x2, y2) - как в задании
        return (Math.sqrt((Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2))));
    }

}
