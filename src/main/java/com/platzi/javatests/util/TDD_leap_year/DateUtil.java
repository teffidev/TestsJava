package com.platzi.javatests.util.TDD_leap_year;

public class DateUtil {

    public static boolean isLeapYear(int year){
        /*if(year % 4 == 0 && year % 100 != 0){
            return true;
        }

        if(year % 400 == 0){
            return true;
        }else {
            return false;
        }*/

        /*Mejoremos nuestro código:*/
        /*if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        } else {
            return false;
        }*/

        /*Podemos simplificar el if-else*/
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
