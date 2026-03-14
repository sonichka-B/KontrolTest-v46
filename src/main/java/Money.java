import java.util.Objects;

public class Money {
    private final double amount;

    public Money(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
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
