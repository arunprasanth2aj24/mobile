package FoodOrdering;

public abstract class BaseFunctionalities implements BaseFunctionalitiesInterface{
    private int orderId;
    private int totalPrice;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}