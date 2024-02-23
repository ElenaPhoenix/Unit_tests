package Seminar5.integration;

import Seminar5.order.OrderService;
import Seminar5.order.PaymentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderPaymentIntegrationTest {
    @Test
    void testPaymentService() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("A", 1);

        assertTrue(result);
    }
}