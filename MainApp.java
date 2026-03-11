import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainApp extends JFrame {

    BusSystem system = new BusSystem();

    public MainApp() {

        setTitle("Mosepele Tours System");
        setSize(500,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top panel (Title Bar)
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(25,118,210));

        JLabel title = new JLabel("Mosepele Tours Bus System");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setForeground(Color.WHITE);

        topPanel.add(title);
        add(topPanel, BorderLayout.NORTH);

        // Center panel for buttons
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(new Color(240,240,240));
        centerPanel.setLayout(new GridLayout(3,1,20,20));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(40,120,40,120));

        JButton bookTicket = new JButton("Book Ticket");
        JButton viewTickets = new JButton("View Tickets");
        JButton exit = new JButton("Exit");

        // Button styling
        Font btnFont = new Font("Arial", Font.BOLD, 14);

        bookTicket.setFont(btnFont);
        viewTickets.setFont(btnFont);
        exit.setFont(btnFont);

        bookTicket.setBackground(new Color(76,175,80));
        bookTicket.setForeground(Color.WHITE);

        viewTickets.setBackground(new Color(33,150,243));
        viewTickets.setForeground(Color.WHITE);

        exit.setBackground(new Color(244,67,54));
        exit.setForeground(Color.WHITE);

        centerPanel.add(bookTicket);
        centerPanel.add(viewTickets);
        centerPanel.add(exit);

        add(centerPanel, BorderLayout.CENTER);

        // Button actions
        bookTicket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new BookingFrame(system);

            }
        });

        viewTickets.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                system.showTicketsGUI();

            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }
        });

        setVisible(true);
    }
}