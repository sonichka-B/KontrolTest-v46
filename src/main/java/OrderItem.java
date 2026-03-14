public class OrderItem {
    private final String name;
    private final Money price;

    public OrderItem(String name, Money price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
