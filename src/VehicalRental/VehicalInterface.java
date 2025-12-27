package VehicalRental;

public interface VehicalInterface extends BaseFunctionalitiesInterface{
    public void book(int days);
    public void book(int days, int hours);
    public void cancel();
}
