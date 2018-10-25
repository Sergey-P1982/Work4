package com.epam.task1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value=Parameterized.class)
public class TestTemperatureConverter {

    public static TemperatureConverter converter;

    @Parameterized.Parameter
    public double temperatureC;
    @Parameterized.Parameter(1)
    public double temperatureK;
    @Parameterized.Parameter(2)
    public double temperatureF;

//    public TestTemperatureConverter(double temperatureC, double temperatureK, double temperatureF) {
//        this.temperatureC = temperatureC;
//        this.temperatureK = temperatureK;
//        this.temperatureF = temperatureF;
//    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
            {0.0, 273.2, 32.0},
            {-100, 173.2, -148.0},
            {-273.2, 0.0, -459.76},
            {273.2, 546.4, 523.76},
                {100, 373.2, 212 }
        });
    }


    @BeforeClass
            public static void init() {
        converter = new TemperatureConverter();
    }

    @Test
    public void testConvertFtoC () {
        double result = converter.convertFtoC(temperatureF);
        Assert.assertEquals(temperatureC, result, 0.01);
    }

    @Test
    public void testConvertCtoF () {
        double result = converter.convertCtoF(temperatureC);
        Assert.assertEquals(temperatureF, result, 0.01);
    }

    @Test
    public void testConvertCtoK () {
        double result = converter.convertCtoK(temperatureC);
        Assert.assertEquals(temperatureK, result, 0.01);
    }
    @Test
    public void testConvertKtoC () {
        double result = converter.convertKtoC(temperatureK);
        Assert.assertEquals(temperatureC, result,0.1);
    }

    @Test
    public void testConvertFtoK () {
        double result = converter.convertFtoK(temperatureF);
        Assert.assertEquals(temperatureK, result, 0.1);
    }
    @Test
    public void testConvertKtoF () {
        double result = converter.convertKtoF(temperatureK);
        Assert.assertEquals(temperatureF, result,0.1);
    }
}
