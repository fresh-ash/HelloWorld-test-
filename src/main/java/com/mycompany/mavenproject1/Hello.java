/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;

/**
 *
 * @author sergei
 */
public class Hello {
    public static String timesOfDay(Date date){
        Logger log = Logger.getLogger(Hello.class);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH");
        int time = Integer.parseInt(dateFormat.format(date));
        if ((time > 6) && (time <= 9)){
            log.info("Morning message");
            return "morning";
        }
        else if ((time > 9) && (time <= 19)){
            log.info("Day message");
            return "day";
        }
        else if ((time > 19) && (time <= 23)){
            log.info("Evening message");
            return "evening";
        }
        log.info("Night message");
        return "night";
    }
}
