package FoodOrdering;

public class NonVegMeal extends Meals implements NonVegMealsInterface {


    public void extraGravy(String gravy) {
        System.out.println(gravy);
    }



    @Override
    public void placeOrder(int qty) {
        int res = qty * 250;
        this.setTotalPrice(res);
        System.out.println("Order placed sucessfully");
        System.out.println("Total Price:");
        System.out.println(this.getTotalPrice());
    }
}