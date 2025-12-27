package FoodOrdering;

public abstract class Meals extends BaseFunctionalities implements MealsInterface{




        public void placeOrder(int qty){
            int res = qty * 100;
            this.setTotalPrice(res);
            System.out.println("Order placed sucessfully");
            System.out.println("Total Price:");
            System.out.println(this.getTotalPrice());

        }

        public void cancel(){
            System.out.println("Order cancelled");
        }
}
