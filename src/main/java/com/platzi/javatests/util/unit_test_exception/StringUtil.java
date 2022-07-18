package com.platzi.javatests.util.unit_test_exception;

public class StringUtil {

    public static String repeat(String str, int times){

        if(times < 0){
            throw new IllegalArgumentException("negative times not alowed");
        }

        String result = "";

        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;

    }
}
