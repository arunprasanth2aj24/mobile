package VehicalRental;

public abstract class BaseFunctionalities implements BaseFunctionalitiesInterface {
    private int vehNo;
    private int rent;

    public int getVehNo() {
        return vehNo;
    }

    public void setVehNo(int vehicalNo) {
        this.vehNo = vehicalNo;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

}
