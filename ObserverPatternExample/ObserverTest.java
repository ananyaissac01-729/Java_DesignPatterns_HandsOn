public class ObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);
        market.setStockPrice("TCS", 3500.0); 
        market.deregister(web);  
        market.setStockPrice("TCS", 3550.0);  
    }
}