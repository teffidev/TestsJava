package com.platzi.javatests.util.test_improvements;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class improvements_PaymentProcessorTest {
    /*Campos de test
    * variables como campos de la clase:*/
    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;


    /*Movemos el código repetido(partes comunes) a un método común, se suele llamar "setup"
    * el método se crea con la anotación "@Before", para que JUnit sepa que debe ejecutarlo
    * cada vez ANTES de ejecutar cada test, primero ejecuta está parte:.*/
    @Before
    public void setup(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }


    @Test
    public void payment_is_correct(){
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        //boolean result = paymentProcessor.makePayment(1000);
        // assertTrue(result);
        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong(){
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }

}