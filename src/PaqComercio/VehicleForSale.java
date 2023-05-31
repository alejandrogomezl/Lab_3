package PaqComercio;

public class VehicleForSale extends Vehicle implements Cloneable{
    double price;
    int discount;

    public VehicleForSale() {
    }

    public VehicleForSale(String brand, String licensePlate, double price, int discount) {
        super(brand, licensePlate);
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    public Object clone() throws CloneNotSupportedException {
        VehicleForSale obj = (VehicleForSale) super.clone();
        obj.price = this.price;
        obj.discount = this.discount;

        obj.brand = this.brand;
        obj.licensePlate = this.licensePlate;
        return obj;
    }
}
