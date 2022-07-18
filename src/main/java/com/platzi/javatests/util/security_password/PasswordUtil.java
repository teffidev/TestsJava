package com.platzi.javatests.util.security_password;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPasword(String password) {

        if(password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }

        if(password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }

}
