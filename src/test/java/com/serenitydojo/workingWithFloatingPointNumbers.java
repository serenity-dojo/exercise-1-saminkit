package com.serenitydojo;

import org.junit.Test;


public class workingWithFloatingPointNumbers {
    @Test
    public void celciusToFarenheit(){
        double celcius=50.00;
        double farenheit=0;
        farenheit= (celcius * 1.8) + 32;
        System.out.println("Temperaure in farenheit is : " +farenheit);
    }
}
