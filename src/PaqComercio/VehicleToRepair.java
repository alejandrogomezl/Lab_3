package PaqComercio;

import java.util.concurrent.atomic.AtomicLongArray;

public class VehicleToRepair extends Vehicle implements Cloneable {
    String accident;
    boolean repaired;
    int priority;

    public VehicleToRepair() {
    }

    public VehicleToRepair(String brand, String licensePlate, String accident, boolean repaired, int priority) {
        super(brand, licensePlate);
        this.accident = accident;
        this.repaired = repaired;
        this.priority = priority;
    }

    public String getAccident() {
        return accident;
    }

    public void setAccident(String accident) {
        this.accident = accident;
    }

    public boolean isRepaired() {
        return repaired;
    }

    public void setRepaired(boolean repaired) {
        this.repaired = repaired;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Object clone() throws CloneNotSupportedException {
        VehicleToRepair obj = (VehicleToRepair) super.clone();
        obj.repaired = this.repaired;
        obj.accident = this.accident;
        obj.priority = this.priority;

        obj.brand = this.brand;
        obj.licensePlate = this.licensePlate;
        return obj;
    }
}
