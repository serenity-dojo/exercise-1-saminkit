package com.serenitydojo;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumbers {
    @Test
    public void addingNumbersTogether(){
        int initialYear = 1975;
        int timeJump = 30;
        int targetYear = 0;
        targetYear=initialYear + timeJump;

        assertThat(targetYear, equalTo(2005));
        System.out.println(targetYear);
    }
}
