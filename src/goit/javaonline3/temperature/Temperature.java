package goit.javaonline3.temperature;

/**
 * Created by Ler4enko on 01.06.2016.
 */
public class Temperature {

    private static final int INITIAL_DEGREE = 32;
    private static final double COEFFICIENT = 1.8;

    public static double fromCelsiusToFahrenheit(double degree){
        return(degree * COEFFICIENT + INITIAL_DEGREE);
    }

    public static double fromFahrenheitToCelsius(double degree){
        return((degree - INITIAL_DEGREE) / COEFFICIENT);
    }

    public static int getInitialDegree() {
        return INITIAL_DEGREE;
    }

    public static double getCoefficient() {
        return COEFFICIENT;
    }
}

//gradus, COEFFICIENT - grammar mistakes

//getInitialDegree(), getCoefficient() - думаешь они понядобятся где-то еще?

//getCoefficient() - return COEFFICIENT - не совпадают названия

//static methods

