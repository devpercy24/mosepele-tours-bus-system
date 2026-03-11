import javax.swing.*;
import java.awt.event.*;

public class BookingFrame extends JFrame {

    public BookingFrame(BusSystem system) {

        setTitle("Book Ticket");
        setSize(350,300);
        setLayout(null);

        JLabel nameLabel = new JLabel("Passenger Name:");
        nameLabel.setBounds(20,20,120,25);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150,20,150,25);
        add(nameField);

        JLabel totalLabel = new JLabel("Total Passengers:");
        totalLabel.setBounds(20,60,120,25);
        add(totalLabel);

        JTextField totalField = new JTextField();
        totalField.setBounds(150,60,150,25);
        add(totalField);

        JLabel discountLabel = new JLabel("Discount Passengers:");
        discountLabel.setBounds(20,100,130,25);
        add(discountLabel);

        JTextField discountField = new JTextField();
        discountField.setBounds(150,100,150,25);
        add(discountField);

        JLabel destLabel = new JLabel("Destination:");
        destLabel.setBounds(20,140,120,25);
        add(destLabel);

        JTextField destField = new JTextField();
        destField.setBounds(150,140,150,25);
        add(destField);

        JButton book = new JButton("Confirm Booking");
        book.setBounds(90,190,150,30);
        add(book);

        book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    String name = nameField.getText();
                    int total = Integer.parseInt(totalField.getText());
                    int discount = Integer.parseInt(discountField.getText());
                    String destination = destField.getText();

                    Passenger p = new Passenger(name,total,discount);

                    system.bookTicketGUI(p,destination);

                    JOptionPane.showMessageDialog(null,"Ticket booked!");

                } catch(Exception ex) {

                    JOptionPane.showMessageDialog(null,"Invalid input");

                }
            }
        });

        setVisible(true);
    }
}