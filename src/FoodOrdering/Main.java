package FoodOrdering;
/*
* This is my food ordering app
*It has 3 entities Customer VegMeals and NonVegMeals
* Customer knows mealType and quantity the orderId and total price will be get from the Veg or NonVeg Meal
* Both Veg and NonVeg meals perform order for the Customer
* VegMeal knows orderId the total price will be calculated by using operation by getting the quantity from the customer and multiplying it with the meal price
* And the value will be set in the Total price
* Then it just print order placed and the total price
* The cancel order method only prints Order Cancelled
* Extra Cheese method just prints Extra Cheese Added
* NonVegMeal knows orderId the total price will be calculated by using operation by getting the quantity from the customer and multiplying it with the meal price
*  And the value will be set in the Total price
* Then it just print order placed and the total price
* The cancel order method only prints Order Cancelled
* Add extra Gravy function only prints Extra Gravy Added It is the unique method in NonVegMeals
 */
public class Main {
    public static void main(String[] args){
        CustomerInterface customer = new Customer();
        VegMealsInterface vm = new VegMeal();
        NonVegMealsInterface nm = new NonVegMeal();

        customer.setMealType("VegMeals");
        customer.setQuantity(2);

        vm.setOrderId(1566);
        vm.placeOrder(customer.getQuantity());
        vm.extraCheese("Extra cheese added");
        customer.setOrderId(vm.getOrderId());
        customer.setTotalPrice(vm.getTotalPrice());


        CustomerInterface customer2 = new Customer();
        customer2.setMealType("NonVegMeals");
        customer2.setQuantity(2);

        nm.setOrderId(7743);
        nm.placeOrder(customer2.getQuantity());
        nm.extraGravy("Extra Gravy added");
        customer2.setOrderId(nm.getOrderId());
        customer2.setTotalPrice(nm.getTotalPrice());


    }
}
