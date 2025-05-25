package view;

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
        export.addActionListener(e -> {
            try {
                BookingExporter.exportBookingsToFile("bookings.csv");
                JOptionPane.showMessageDialog(this, "Bookings exported successfully!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error exporting bookings: " + ex.getMessage());
            }
        });

        JPanel panel = new JPanel();
        panel.add(viewPackages);
        panel.add(book);
        panel.add(export);

        add(panel);
        setVisible(true); // Ensuring visibility after adding components
    }
}