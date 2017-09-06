/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergei
 */
public class HelloTest {
    
    /**
     * Test of timesOfDay method, of class Hello. It isn't good idea.
     */
    @Test
    public void testTimesOfDay() {
        System.out.println("timesOfDay");
        Calendar date = new GregorianCalendar(2017, 9, 6, 9,10, 0);
        String expResult = "day";
        String result = Hello.timesOfDay(date);
        // 
        assertEquals(expResult, result);
        //
        date = new GregorianCalendar(2017, 9, 6, 0,0, 0);
        expResult = "night";
        result = Hello.timesOfDay(date);
        //
        assertEquals(expResult, result);
        //
        date = new GregorianCalendar(2017, 9, 6, 6, 0, 0);
        expResult = "morning";
        result = Hello.timesOfDay(date);
        //
        assertEquals(expResult, result);
        //
        date = new GregorianCalendar(2017, 9, 6, 19,10, 00);
        expResult = "evening";
        result = Hello.timesOfDay(date);
        //
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
