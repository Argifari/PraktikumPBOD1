public interface Payment {

    void processPayment(double amount) throws PaymentException;
}
