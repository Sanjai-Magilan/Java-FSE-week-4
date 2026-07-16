package Week1.Module1.StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("paid using paypal");
    }
}
