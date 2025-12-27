package VehicalRental;

public abstract class Vehical extends BaseFunctionalities implements VehicalInterface{
    public void book(int days){
        int rent = this.getRent() * days;
        this.setRent(rent);
        System.out.println("Booking Sucessful");
        System.out.println("Days");
        System.out.println(days);
        System.out.println("Rent");
        System.out.println(this.getRent());

    }
    public void book(int days, int hours){
        int rent = this.getRent() * days *(hours/24) ;
        this.setRent(rent);
        System.out.println("Booking Sucessful");
        System.out.println("Days");
        System.out.println(days);
        System.out.println("Rent");
        System.out.println(this.getRent());

    }

    public void cancel(){
        System.out.println("Your Booking cancelled");
        int rent =this.getRent() - this.getRent();
        this.setRent(rent);
    }

}
