public class Main {

    public static void main(String[] args) {
        OrderRepository repository = new OrderRepository(10);
        DefaultOrderProcessor processor = new DefaultOrderProcessor(repository);

        OrderItem item1 = new OrderItem("Laptop", new Money(2000));
        OrderItem item2 = new OrderItem("E-book", new Money(500));

        OrderItem[] items = {item1, item2};
        Order order = new Order("1", items);
        repository.save(order);
        PaymentMethod payment = new CardPayment();
        Email email = new Email("asd@as");
        try {
            processor.process(order, payment, email);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
