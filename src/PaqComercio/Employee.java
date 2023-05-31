package PaqComercio;

public class Employee implements Cloneable{
    String IDCard;
    String name;
    String address;
    int phoneNumber;
    String email;
    String startDate;
    double salary;
    String position;

    public Employee() {
    }

    public Employee(String IDCard, String name, String address, int phoneNumber, String email, String startDate, double salary, String position) {
        this.IDCard = IDCard;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.startDate = startDate;
        this.salary = salary;
        this.position = position;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Object clone() throws CloneNotSupportedException{
        Employee obj = (Employee) super.clone();

        obj.name = this.name;
        obj.address = this.address;
        obj.IDCard = this.IDCard;
        obj.phoneNumber = this.phoneNumber;
        obj.email = this.email;
        obj.startDate = this.startDate;
        obj.salary = this.salary;
        obj.position = this.position;

        return obj;
    }

    public String toString(){
        return "IDCard: " + IDCard + "\nName: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\nStart Date: " + startDate + "\nSalary: " + salary + "\nPosition: " + position;
    }
}
