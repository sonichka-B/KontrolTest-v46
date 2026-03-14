public class CardPayment implements PaymentMethod {
    private final static double MAX_AMOUNT = 10000.0;
    @Override
    public void pay(Money amount) {
        if(amount.getAmount()>MAX_AMOUNT || amount.getAmount()<0){
            throw new IllegalArgumentException("illegal amount");
        }
        System.out.println("Paid with card: " + amount);
    }
}
