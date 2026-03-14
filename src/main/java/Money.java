import java.util.Objects;

public class Money {
    private final double amount;
    private final static double MAX_AMOUNT = 10000.0;

    public Money(double amount){
        if(amount<=0 || amount>MAX_AMOUNT){
            throw new InvalidData("invalid amount");
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Money add(Money other) {
        return new Money(this.amount + other.amount);
    }

    public Money multiply(int factor) {
        return new Money(this.amount * factor);
    }

    public Money multiply(double factor) {
        return new Money(Math.round(this.amount * factor));
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Money money)) return false;
        return Double.compare(amount, money.amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(amount);
    }
}
