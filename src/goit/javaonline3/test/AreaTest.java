package goit.javaonline3.test;

import goit.javaonline3.area.Area;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class AreaTest {

    @Test
    public void testCountTriangleArea() throws Exception {
        assertTrue(1 == Area.countTriangleArea(1,2));
    }

    @Test
    public void testCountSquareArea() throws Exception {
        assertTrue(6 == Area.countSquareArea(2,3));
    }

    @Test
    public void testCountCircleArea() throws Exception {
        assertEquals(3.14, Area.countCircleArea(1), 0.01);

    }
}