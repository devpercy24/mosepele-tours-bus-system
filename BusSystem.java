import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BusSystem {

    private ArrayList<Ticket> tickets = new ArrayList<>();

    String[] destinations = {"Palapye", "Francistown", "Maun", "Kasane", "Serowe"};
    double[] fares = {90, 120, 300, 400, 100};

    
    public void bookTicketGUI(Passenger p, String destination) {

        double fare = 0;

    
        for (int i = 0; i < destinations.length; i++) {
            if (destinations[i].equalsIgnoreCase(destination)) {
                fare = fares[i];
            }
        }

        int total = p.getTotalPassengers();
        int discount = p.getDiscountPassengers();

        double discountFare = fare * 0.8;
        double totalFare = (total - discount) * fare + discount * discountFare;

        Ticket t = new Ticket(p, destination, totalFare);
        tickets.add(t);

        JOptionPane.showMessageDialog(null,
                "Ticket booked successfully!\n\n" +
                "Passenger: " + p.getName() +
                "\nDestination: " + destination +
                "\nTotal fare: P" + totalFare
        );
    }

    
    public void showTicketsGUI() {

        if (tickets.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No tickets booked yet!");
            return;
        }

        String output = "";

        for (int i = 0; i < tickets.size(); i++) {

            Ticket t = tickets.get(i);
            Passenger p = t.getPassenger();

            output += "Ticket " + (i + 1) + "\n";
            output += "Passenger: " + p.getName() + "\n";
            output += "Destination: " + t.getDestination() + "\n";
            output += "Total Fare: P" + t.getTotalFare() + "\n";
            output += "Paid: " + (t.isPaid() ? "Yes" : "No") + "\n";
            output += "-----------------------\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }

    
    public String[] getDestinations() {
        return destinations;
    }
}