package com.platzi.javatests.util.TDD_leap_year;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateUtilLeapYearShould {
    /*
    ALL years divisible by 400 ARE leap years (1600, 2000, 2400),
    ALL years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900),
    ALL years divisible by 4 but not by 100 ARE leap years (1996, 2004, 2008),
    ALL years not divisible by 4 are NOT leap years (2017, 2018, 2019).
    */

    @Test
    public void return_true_whe_year_is_divisible_by_400(){
        assertThat(DateUtil.isLeapYear(1600), is(true));
        assertThat(DateUtil.isLeapYear(2000), is(true));
        assertThat(DateUtil.isLeapYear(2400), is(true));
    }

    @Test
    public void return_false_whe_year_is_divisible_by_100_but_not_by_400(){
        assertThat(DateUtil.isLeapYear(1700), is(false));
        assertThat(DateUtil.isLeapYear(1800), is(false));
        assertThat(DateUtil.isLeapYear(1900), is(false));
    }

    @Test
    public void return_true_whe_year_is_divisible_by_4_but_not_by_100(){
        assertThat(DateUtil.isLeapYear(1996), is(true));
        assertThat(DateUtil.isLeapYear(2004), is(true));
        assertThat(DateUtil.isLeapYear(2008), is(true));
    }

    @Test
    public void return_false_whe_year_is_not_divisible_by_4(){
        assertThat(DateUtil.isLeapYear(2017), is(false));
        assertThat(DateUtil.isLeapYear(2018), is(false));
        assertThat(DateUtil.isLeapYear(2019), is(false));
    }

}