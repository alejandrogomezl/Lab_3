import PaqComercio.Business;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Business business = new Business();
        business.setDailySales(new int[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println(business.toStringDailySales());
    }
}