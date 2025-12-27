package FoodOrdering;

public interface CustomerInterface extends BaseFunctionalitiesInterface {
    public int getQuantity();
    public void setQuantity(int quantity);
    public String getMealType();
    public void setMealType(String mealType);
}
