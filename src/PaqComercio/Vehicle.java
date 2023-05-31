package PaqComercio;

public class Vehicle implements Cloneable{
    String brand;
    String licensePlate;

    public Vehicle() {
    }

    public Vehicle(String brand, String licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    public Object clone() throws CloneNotSupportedException {
        Vehicle obj = (Vehicle) super.clone();
        obj.brand = this.brand;
        obj.licensePlate = this.licensePlate;
        return obj;
    }
}
