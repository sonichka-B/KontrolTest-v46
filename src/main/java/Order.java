import java.util.Arrays;

public class Order {
    private final String id;
    private final OrderItem[] items;
    private final Money totalAmount;

    public Order(String id, OrderItem[] items, Money totalAmount){
        this.id = id;
        this.items = Arrays.copyOf(items, items.length);
        this.totalAmount = totalAmount;
    }

    public String getId() {
        return id;
    }

    public OrderItem[] getItems() {
        return Arrays.copyOf(items, items.length);
    }

    public Money getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", items=" + Arrays.toString(items) +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
