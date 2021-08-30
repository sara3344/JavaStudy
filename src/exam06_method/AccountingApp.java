package exam06_method;

public class AccountingApp {
    // 공급가액
    public static double valueOfSupply = 10000.0;

    // 부가가치세율
    public static double vatRate = 0.1;

    public static double getVat() {
        return valueOfSupply * vatRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVat();
    }

    public static void main(String[] args) {

        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT: " + getVat());
        System.out.println("Total : " + getTotal());
    }
}
