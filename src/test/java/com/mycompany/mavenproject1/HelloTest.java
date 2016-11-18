/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergei
 */
public class HelloTest {
    
    /**
     * Test of timesOfDay method, of class Hello.
     */
    @Test
    public void testTimesOfDay() {
        System.out.println("timesOfDay");
        Date date = new Date(0,0,0,12,30);
        String expResult = "day";
        String result = Hello.timesOfDay(date);
        // 
        assertEquals(expResult, result);
        //
        date = new Date(0,0,0,1,0);
        expResult = "night";
        result = Hello.timesOfDay(date);
        //
        assertEquals(expResult, result);
        //
        date = new Date(0,0,0,7,0);
        expResult = "morning";
        result = Hello.timesOfDay(date);
        //
        assertEquals(expResult, result);
        //
        date = new Date(0,0,0,20,0);
        expResult = "evening";
        result = Hello.timesOfDay(date);
        //
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
