public class CardPayment implements PaymentMethod {

    @Override
    public void pay(Money amount) {
        System.out.println("Paid with card: " + amount);
    }
}
