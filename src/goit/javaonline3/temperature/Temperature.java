package goit.javaonline3.temperature;
//Зачем нужен этот импорт?
import java.lang.management.GarbageCollectorMXBean;

/**
 * Created by Ler4enko on 01.06.2016.
 */
public class Temperature {
    //GRADUS, KOEFICIENT, Celsii, Faringet, gradus - нет таких слов
    private static final int INITIAL_GRADUS = 32;
    private static final double KOEFICIENT = 1.8;

    public double fromCelsiiToFaringet(double gradus){
        return(gradus * KOEFICIENT + INITIAL_GRADUS);
    }

    public double fromFaringetToCelsii(double gradus){
        return((gradus - INITIAL_GRADUS) / KOEFICIENT);
    }

    public static int getInitialGradus() {
        return INITIAL_GRADUS;
    }

    public static double getKOEFICIENT() {
        return KOEFICIENT;
    }
}
