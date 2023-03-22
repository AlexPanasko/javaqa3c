public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int amount = 1_000_000;
        double rate = 9.99;
        int term = 1;

        int monthlyPaymentYear = service.calculate(amount, term, rate);
        System.out.println(monthlyPaymentYear);

        term = 2;
        monthlyPaymentYear = service.calculate(amount, term, rate);
        System.out.println(monthlyPaymentYear);

        term = 3;
        monthlyPaymentYear = service.calculate(amount, term, rate);
        System.out.println(monthlyPaymentYear);
    }
}