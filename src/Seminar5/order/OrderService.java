package Seminar5.order;

/**
 * У вас есть сервис по обработке заказов, состоящий из двух классов: OrderService и
 * PaymentService. Класс OrderService обрабатывает заказы и делает вызовы к
 * PaymentService для обработки платежей. Ваша задача - написать интеграционный тест,
 * который проверяет, что OrderService и PaymentService взаимодействуют корректно
 */
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public boolean placeOrder(String orderId, double amount) {
        // Заказ принимается, только если платеж успешно обработан
        return paymentService.processPayment(orderId, amount);
    }
}
