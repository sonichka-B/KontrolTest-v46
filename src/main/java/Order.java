import java.util.Arrays;

public class Order {
    private final String id;
    private final OrderItem[] items;

    public Order(String id, OrderItem[] items){
        this.id = id;
        this.items = Arrays.copyOf(items, items.length);
    }

    public String getId() {
        return id;
    }

    public OrderItem[] getItems() {
        return Arrays.copyOf(items, items.length);
    }


    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
