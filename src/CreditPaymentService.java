public class CreditPaymentService {

    public double calculate(int amount, float month, int period) {

        float percent = month / 12;
        double degree = Math.pow((1 + percent / 100), (period * 12));

        return ((percent / 100 * (amount * degree))) / (degree - 1);

    }
}
