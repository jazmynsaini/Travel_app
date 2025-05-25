

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
            String userText = userField.getText().trim();
            String packageText = packageField.getText().trim();

            if (userText.isEmpty() || packageText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                int userId = Integer.parseInt(userText);
                int packageId = Integer.parseInt(packageText);
                Booking b = new Booking(0, userId, packageId, new Date());
                boolean success = new BookingDAO().bookPackage(b);
                JOptionPane.showMessageDialog(this, success ? "Booked!" : "Failed.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric IDs.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
