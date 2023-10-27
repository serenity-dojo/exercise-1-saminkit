package com.serenitydojo;

import org.junit.Test;

public class WhenWorkingWithStrings {
    @Test
    public void WorkingWithStrings(){
        String name="  Samuel maniraj selvaraj  ";
        // Upper Case
        String UpperCase=name.toUpperCase();
        System.out.println(UpperCase);

        // Lower Case
        String LowerCase=name.toLowerCase();
        System.out.println(LowerCase);

        // Trim
        String TrimExraspace=name.trim();
        System.out.println(TrimExraspace);

        // Length
        System.out.println(name.length());

        // Replace
        String ReplaceName = name.replace("selvaraj","abraham");

    }
}
