package goit.javaonline3.temperature;
//Зачем нужен этот импорт?

/**
 * Created by Ler4enko on 01.06.2016.
 */
public class Temperature {
    //GRADUS, KOEFICIENT, Celsii, Faringet, gradus - нет таких слов
    private static final int INITIAL_DEGREE = 32;
    private static final double KOEFICIENT = 1.8;

    public double fromCelsiusToFahrenheit(double gradus){
        return(gradus * KOEFICIENT + INITIAL_DEGREE);
    }

    public double fromFahrenheitToCelsius(double gradus){
        return((gradus - INITIAL_DEGREE) / KOEFICIENT);
    }

    public static int getInitialDegree() {
        return INITIAL_DEGREE;
    }

    public static double getCoefficient() {
        return KOEFICIENT;
    }
}
