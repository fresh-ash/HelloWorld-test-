/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.Calendar;
import java.util.ResourceBundle;


/**
 *
 * @author sergei
 * StartApp
 */
public class MainHello {
    public static void main(String[] args){
        ResourceBundle bundle = ResourceBundle.getBundle("Message");
        Calendar date = Calendar.getInstance();
        System.out.println(bundle.getString(Hello.timesOfDay(date)));
        
     }
}


