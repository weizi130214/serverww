package com.service.serverww.controller;

import org.springframework.stereotype.Component;


@Component
public class ServerwwDelegate implements Serverww {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
