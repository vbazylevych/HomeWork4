package goit.javaonline3.test;

import goit.javaonline3.distance.Distance;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class DistanceTest {

    @Test
    public void testCountDistance() throws Exception {
        assertTrue(5 == Distance.countDistance(0, 0, 0, 5));
    }
}