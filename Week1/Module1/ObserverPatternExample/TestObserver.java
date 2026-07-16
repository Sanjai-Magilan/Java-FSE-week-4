package Week1.Module1.ObserverPatternExample;

public class TestObserver {
    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("Sanjai");
        Observer web = new WebApp("Rahul");

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStockPrice("TCS",200);
        market.setStockPrice("INFY",1850);
        market.deregisterObserver(web);

        market.setStockPrice("WIPRO",310);
    }
}
