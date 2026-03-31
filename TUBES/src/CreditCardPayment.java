public class CreditCardPayment implements Payment{

    private String number;


    public CreditCardPayment(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        if (amount <= 0) {
            throw new PaymentException("Jumlah pembayaran tidak valid");
        }

        System.out.println("Credit Card No : " + number);
        System.out.println("Pembayaran berhasil sebesar: Rp" + amount);
    }
    
}
