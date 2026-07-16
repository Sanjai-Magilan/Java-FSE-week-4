package Week1.Module1.StrategyPatternExample;

public class TestStrategy {
    public static void main(String[] args) {

    PaymentContext pay = new PaymentContext();
    pay.setPaymentMethod(new CreditCardPayment());
    pay.pay();
    pay.setPaymentMethod((new PayPalPayment()));
    pay.pay();
    }
}
