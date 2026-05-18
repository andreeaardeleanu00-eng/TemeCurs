package Tema8;

public class OnlineOrder extends Order {

    public OnlineOrder(int orderID) {
        super(orderID);
    }

    public void trackOrder() {
        System.out.println("Tracking order: " + orderID);
    }
}
