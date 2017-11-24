package com.service.serverww.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestServerww {

    ServerwwDelegate serverwwDelegate = new ServerwwDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = serverwwDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
