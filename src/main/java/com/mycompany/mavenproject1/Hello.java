/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.apache.log4j.Logger;

import java.util.Calendar;

/**
 *
 * @author sergei
 *  Logic 
 */
public class Hello {
    public static String timesOfDay(Calendar calendar){

        Logger log = Logger.getLogger(Hello.class);
        int date = calendar.get(Calendar.HOUR_OF_DAY);

        if ((date >= 6) && (date < 9)){
            log.info("Morning message");
            return "morning";
        }
        else if ((date >= 9) && (date < 19)){
            log.info("Day message");
            return "day";
        }
        else if ((date >= 19) && (date < 23)){
            log.info("Evening message");
            return "evening";
        }
        log.info("Night message");
        return "night";
    }
}
