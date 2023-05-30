package PaqComercio;

import java.time.LocalDate;
public class Business implements Cloneable {
    String name;
    String address;
    String ID;
    int [][] dailySales = new int[12][31];
    int [] stock;
    Employee [] employees;

    public Business() {
    }

    public Business(String name, String address, String ID) {
        this.name = name;
        this.address = address;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int[][] getDailySales() {
        return dailySales;
    }

    public void setDailySales(int[][] dailySales) {
        this.dailySales = dailySales;
    }

    public int[] getStock() {
        return stock;
    }

    public void setStock(int[] stock) {
        this.stock = stock;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    int calculateTotalventas(){
        int total = 0;
        for (int i = 0; i < dailySales.length; i++) {
            for (int j = 0; j < dailySales[i].length; j++) {
                total += dailySales[i][j];
            }
        }
        return total;
    }

    int calculateSalesMonth(int month){
        month--;
        int total = 0;
        for (int i = 0; i < dailySales[month].length;i++){
            total = total + this.dailySales[month][i];
        }
        return total;
    }

    int monthMayorSales(){
        int totalmonth = 0;
        int totalmonthant = 0;
        int montmayor = 0;

        for (int i = 0; i < dailySales.length; i++) {
            for (int j = 0; j < dailySales[i].length; j++) {
                totalmonth += this.dailySales[i][j];
                }
            if (totalmonth > totalmonthant){
                montmayor = i;
            }
            totalmonthant = totalmonth;
        }
        return montmayor;
    }

    void updateSales(int amount){
        LocalDate date = LocalDate.now();
        int mes = date.getMonthValue() - 1;
        int day = date.getDayOfMonth() -1;

        this.dailySales[mes][day] = amount;
    }

    protected Object clone() throws CloneNotSupportedException {
        Business obj = (Business) super.clone();
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

    public String toStringDailySales(){
        String str = "";
        for (int i = 0; i < this.dailySales.length; i++) {
            str += "\n";
            for (int j = 0; j < dailySales[i].length; j++) {
                str += this.dailySales[i][j] + " ";
            }
        }
        return str;
    }

    public String toStringStock(){
        String str = "";
        for (int i = 0; i < this.stock.length; i++) {
            str += "\n";
            str += this.stock[i] + " ";
        }
        return str;
    }

}
