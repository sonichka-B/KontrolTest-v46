abstract class OrderProcessorTemplate {
    public final void process(Order order, PaymentMethod paymentMethod, Email email){
        validation(order);
        Money total = calculation(order);
        paymentMethod.pay(total);
        complete(email, total);
    }

    protected abstract void validation(Order order);

    protected abstract Money calculation(Order order);

    protected void complete(Email email, Money total){
        EmailNotificationService emailNotificationService = new EmailNotificationService();
        emailNotificationService.sendReceipt(email,total);
    }
}
