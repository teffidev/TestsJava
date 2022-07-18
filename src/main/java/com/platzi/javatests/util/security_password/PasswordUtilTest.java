package com.platzi.javatests.util.security_password;

import org.junit.Test;

import static com.platzi.javatests.util.security_password.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.assertEquals;

public class PasswordUtilTest {

    /*Voy a comprobar que un password es debil si tiene
    * menos de 8 letras*/
    @Test
    public void weak_when_has_less_than_8_letters(){

        assertEquals(WEAK, PasswordUtil.assessPasword("abcdefgh"));

    }

    @Test
    public void weak_when_has_only_letters(){

        assertEquals(WEAK, PasswordUtil.assessPasword("abcdefgh"));

    }

    @Test
    public void medium_when_has_letters_and_numbers(){

        assertEquals(MEDIUM, PasswordUtil.assessPasword("abcd1234"));

    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols(){

        assertEquals(STRONG, PasswordUtil.assessPasword("abcd123!"));

    }


}