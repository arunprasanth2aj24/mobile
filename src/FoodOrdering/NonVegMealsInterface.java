package FoodOrdering;

public interface NonVegMealsInterface extends MealsInterface,BaseFunctionalitiesInterface{
    public void extraGravy(String gravy);
    public void placeOrder(int qty);
}
