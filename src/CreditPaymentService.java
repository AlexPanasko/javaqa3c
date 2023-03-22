public class CreditPaymentService {
    public int calculate(int amount, int term, double rate) {
        double monthlyRate = rate / 100 / 12;
        double percent = monthlyRate + 1;
        double months = term * 12;
        double total = amount * (monthlyRate + monthlyRate / (Math.pow(percent, months) - 1));
        return (int) total;

    }
}
