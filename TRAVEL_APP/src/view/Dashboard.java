package view;

import util.BookingExporter;

import javax.swing.*;

public class Dashboard extends JFrame {
    public Dashboard() {
        setTitle("Dashboard");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton viewPackages = new JButton("View Packages");
        JButton book = new JButton("Book Package");
        JButton export = new JButton("Export Bookings");

        viewPackages.addActionListener(e -> new PackageViewer());
        book.addActionListener(e -> new BookingForm());
        export.addActionListener(e -> BookingExporter.exportBookingsToFile("bookings.csv"));

        JPanel panel = new JPanel();
        panel.add(viewPackages);
        panel.add(book);
        panel.add(export);

        add(panel);
        setVisible(true);
    }
}
