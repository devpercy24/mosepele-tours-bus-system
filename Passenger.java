public class Passenger {

    private String name;
    private int totalPassengers;
    private int discountPassengers;

    public Passenger(String name, int totalPassengers, int discountPassengers) {
        this.name = name;
        this.totalPassengers = totalPassengers;
        this.discountPassengers = discountPassengers;
    }

    public String getName() {
        return name;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public int getDiscountPassengers() {
        return discountPassengers;
    }
}