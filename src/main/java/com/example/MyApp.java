/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Samer
 */
@Component
public class MyApp {
    
    @Autowired
    BComponentIntf b;
    
    public void uneMeth(){
        System.out.printf("Dans Demo App appel dún bean %s " , b.uneMeth());
    }
}
