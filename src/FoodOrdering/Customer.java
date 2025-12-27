package FoodOrdering;

public class Customer extends BaseFunctionalities implements CustomerInterface{


    private int quantity;
    private String mealType;


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
}
