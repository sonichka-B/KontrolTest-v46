public class PayPalPayment implements PaymentMethod{

    @Override
    public void pay(Money amount) {
        System.out.println("Paid with PayPal: " + amount);
    }
}
