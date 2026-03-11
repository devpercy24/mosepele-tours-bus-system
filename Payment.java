public class Payment {

    public static double processPayment(double totalFare, double amountPaid) {
        if (amountPaid < totalFare) {
            return -1;
        }

        return amountPaid - totalFare;
    }
}