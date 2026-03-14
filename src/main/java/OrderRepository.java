import java.util.Optional;

public class OrderRepository {
    private final Order[] cart;
    private int size;

    public OrderRepository(int capacity) {
        this.cart = new Order[capacity];
        this.size = 0;
    }
    public void save(Order order) {

        if (size >= cart.length) {
            throw new RuntimeException("Repository is full");
        }

        cart[size++] = order;
    }

    public Optional<Order> findById(String id) {

        for (int i = 0; i < size; i++) {
            Order order = cart[i];

            if (order.getId().equals(id)) {
                return Optional.of(order);
            }
        }

        return Optional.empty();
    }
}
