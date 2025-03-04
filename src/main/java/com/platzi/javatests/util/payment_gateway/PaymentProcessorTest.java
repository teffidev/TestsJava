package com.platzi.javatests.util.payment_gateway;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class PaymentProcessorTest {

    @Test
    public void payment_is_correct(){
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        //boolean result = paymentProcessor.makePayment(1000);
        // assertTrue(result);
        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong(){
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        assertFalse(paymentProcessor.makePayment(1000));
    }

}