/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author sergei
 */
public class MainHello {
    public static void main(String[] args){
        Locale loc = new Locale("en", "GB");
        ResourceBundle bundle = ResourceBundle.getBundle("Message");
        System.out.println(bundle.getString(Hello.timesOfDay()));
        ResourceBundle bundle1 = ResourceBundle.getBundle("Message", loc);
        System.out.println(bundle1.getString(Hello.timesOfDay()));
    }
}
