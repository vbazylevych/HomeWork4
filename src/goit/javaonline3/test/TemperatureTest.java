package goit.javaonline3.test;

import goit.javaonline3.temperature.Temperature;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class TemperatureTest {

    @Test
    public void testFromCelsiusToFahrenheit() throws Exception {
        assertEquals(32, Temperature.fromCelsiusToFahrenheit(0), 0);
    }

    @Test
    public void testFromFahrenheitToCelsius() throws Exception {
        assertEquals(10, Temperature.fromFahrenheitToCelsius(50), 0);
    }
}