// MobileApp.java — a concrete observer
public class MobileApp implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("MobileApp notification: " + stockName + " is now Rs." + price);
    }
}