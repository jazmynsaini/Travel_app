package view;

import dao.BookingDAO;
import model.Booking;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class BookingForm extends JFrame {
    public BookingForm() {
        setTitle("Book Package");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JTextField userField = new JTextField();
        JTextField packageField = new JTextField();
        JButton bookBtn = new JButton("Book");

        setLayout(new GridLayout(3, 2));
        add(new JLabel("User ID:")); add(userField);
        add(new JLabel("Package ID:")); add(packageField);
        add(new JLabel()); add(bookBtn);

        bookBtn.addActionListener(e -> {
            Booking b = new Booking(0, Integer.parseInt(userField.getText()), Integer.parseInt(packageField.getText()), new Date());
            boolean success = new BookingDAO().bookPackage(b);
            JOptionPane.showMessageDialog(this, success ? "Booked!" : "Failed.");
        });

        setVisible(true);
    }
}
