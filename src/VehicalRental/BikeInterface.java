package VehicalRental;

public interface BikeInterface extends VehicalInterface {
    public void book(int days);
    public void helmet(String hel);
    public void cancel();
}
