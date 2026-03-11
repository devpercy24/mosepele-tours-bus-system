public class Destination {

    private String name;
    private double fare;
    private int availableSeats;

    public Destination(String name, double fare, int seats) {
        this.name = name;
        this.fare = fare;
        this.availableSeats = seats;
    }

    public String getName() {
        return name;
    }

    public double getFare() {
        return fare;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void reduceSeats(int passengers) {
        availableSeats -= passengers;
    }
}