package VehicalRental;

public interface CarInterface extends BaseFunctionalitiesInterface {
    public void book(int days);
    public void driver(String driv);
    public void cancel();

}
