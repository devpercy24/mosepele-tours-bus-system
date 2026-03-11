public class Ticket {

    private Passenger passenger;
    private String destination;
    private double totalFare;
    private boolean paid;

    public Ticket(Passenger passenger, String destination, double fare) {
        this.passenger = passenger;
        this.destination = destination;
        this.totalFare = fare;
        this.paid = false;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getDestination() {
        return destination;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}