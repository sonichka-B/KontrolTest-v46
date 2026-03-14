public class CashPayment implements PaymentMethod{

    @Override
    public void pay(Money amount) {
        System.out.println("Paid with cash: " + amount);
    }
}
