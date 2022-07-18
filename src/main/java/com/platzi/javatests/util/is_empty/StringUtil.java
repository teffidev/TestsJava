package com.platzi.javatests.util.is_empty;

public class StringUtil {

    public static boolean isEmpty(String str){
        return str == null || str.trim().length() == 0;
    }

}
