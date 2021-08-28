package MyApp;

public class AccountingApp {
    public static void main(String[] args) {

        System.out.println("Value of supply : " + 15000.0);
        System.out.println("VAT : " + (15000.0 * 0.1));
        System.out.println("Total : " + (15000.0 + 15000.0 * 0.1));
        System.out.println("Expense : " + (15000.0 * 0.3));
        System.out.println("Income : " + (15000.0 - 15000.0 * 0.3));
        System.out.println("Dividend 1 : " + (15000.0 - 15000.0 * 0.3) * 0.5);
        System.out.println("Dividend 2 : " + (15000.0 - 15000.0 * 0.3) * 0.3);
        System.out.println("Dividend 3 : " + (15000.0 - 15000.0 * 0.3) * 0.2);
    }
}
