package goit.javaonline3.distance;

/**
 * Created by Ler4enko on 01.06.2016.
 */
public class Distance {

    public double counDistance(double x1, double x2, double y1, double y2){
        return (Math.sqrt((Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2))));
    }

}
