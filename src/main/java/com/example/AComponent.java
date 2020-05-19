/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.stereotype.Component;

/**
 *
 * @author Samer
 */
@Component("A")
public class AComponent implements AComponentIntf {

    private String data;

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }
}
