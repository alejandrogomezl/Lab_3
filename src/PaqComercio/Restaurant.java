package PaqComercio;

public class Restaurant extends Business implements Cloneable{

    String [] dailyMenu;
    int numberTables;
    int capacity;

    public Restaurant() {
    }

    public Restaurant(String name, String address, String ID, int numberTables, int capacity) {
        super(name, address, ID);
        this.numberTables = numberTables;
        this.capacity = capacity;
    }

    public void FixDailyMenu(String menu, int dayOfWeek){
        dailyMenu[dayOfWeek - 1] = menu;
    }

    public String reviewDailyMenu(int dayOfWeek){
        return dailyMenu[dayOfWeek - 1];
    }

    public Object clone() throws CloneNotSupportedException {
        Restaurant obj = (Restaurant) super.clone();
        for (int i = 0; i < this.dailyMenu.length; i++){
            obj.dailyMenu[i] = this.dailyMenu[i];
        }
        obj.numberTables = this.numberTables;
        obj.capacity = this.capacity;

        obj.name = this.name;
        obj.address = this.address;
        obj.ID = this.ID;
        for (int i = 0; i < dailySales.length; i++) {
            for (int j = 0; j < dailySales[i].length; j++) {
                obj.dailySales[i][j] = this.dailySales[i][j];
            }
        }
        for (int i = 0; i < stock.length; i++){
            obj.stock[i] = this.stock[i];
        }
        for (int i = 0; i < employees.length; i++){
            obj.employees[i] = this.employees[i];
        }
        return obj;
    }
}
