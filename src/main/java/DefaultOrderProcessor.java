import java.util.logging.LogRecord;

public class DefaultOrderProcessor extends OrderProcessorTemplate{
    private final OrderRepository repository;

    public DefaultOrderProcessor(OrderRepository repository){
        this.repository = repository;
    }

    @Override
    protected void validation(Order order){
        if(order.getId() == null){
            throw new InvalidData("invalid id");
        }
        repository.save(order);
    }

    @Override
    protected Money calculation(Order order){

        Money sum = new Money(0);

        for(OrderItem item : order.getItems()){
            sum = sum.add(item.getPrice());
        }

        return sum;
    }
}
