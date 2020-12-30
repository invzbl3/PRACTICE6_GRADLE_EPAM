package com.epam.rd.java.basic.practice6.part3;

import com.epam.rd.java.basic.practice6.Demo;
import org.junit.Assert;
import org.junit.Test;

public class ParkingTest {
    @Test
    public void mainTest() {
        Part3.main(new String[]{null});
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldCheckArriveIfExceptionExists() {
        Parking parking = new Parking(0);
        parking.arrive(-5);
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldCheckDepartIfExceptionExists() {
        Parking parking = new Parking(0);
        parking.depart(-5);
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void demoTest() {
        Demo.main(new String[]{});
        Assert.assertTrue("Assertion to be compliant", true);
    }
}