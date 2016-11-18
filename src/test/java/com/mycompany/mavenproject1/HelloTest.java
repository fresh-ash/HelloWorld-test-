/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        HashSet<String> expResult = new HashSet<>();
        expResult.add("morning");
        expResult.add("day");
        expResult.add("evening");
        expResult.add("night");
        String result = Hello.timesOfDay();
        if (expResult.contains(result)){
            System.out.println("Test is good!");
        }
        else{
            fail("The test case is a prototype.");
        }
    }
    
}
