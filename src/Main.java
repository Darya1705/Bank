public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double payment = service.calculate(1_000_000, 9.99F, 1);
        System.out.println((int)payment);

        double paymentTwo = service.calculate(1_000_000, 9.99F, 2);
        System.out.println((int)paymentTwo);

        double paymentThree = service.calculate(1_000_000, 9.99F, 3);
        System.out.println((int)paymentThree);


        
        
    }
}
