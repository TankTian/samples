package com.service.liyongjun008.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSamples {

        SamplesDelegate samplesDelegate = new SamplesDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = samplesDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}