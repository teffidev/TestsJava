package com.platzi.javatests.util.unit_test_exception;

/*import com.sun.tools.javac.util.Assert;*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringUtilTest {

    public static void main(String[] args) {

    }

    public void repeat_string_once(){
            assertEquals(StringUtil.repeat("Hola ", 3), "Hola Hola Hola ");
        }

        public void repeat_string_multiple_times(){
            assertEquals(StringUtil.repeat("Hola ", 1), "Hola ");
        }

        public void repeat_string_zero_times(){
            assertEquals(StringUtil.repeat(" ", 0), "Hola ");
        }

        public void repeat_string_negative_times() {
            assertThrows(IllegalArgumentException.class, () -> {
                StringUtil.repeat("hola", -1);
            });
        }

    }

