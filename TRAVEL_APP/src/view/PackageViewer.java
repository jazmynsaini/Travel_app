package view;

import dao.PackageDAO;
import model.TravelPackage;

import javax.swing.*;
import java.util.List;

public class PackageViewer extends JFrame {
    public PackageViewer() {
        setTitle("Travel Packages");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();
        area.setEditable(false);

        List<TravelPackage> list = new PackageDAO().getAllPackages();
        for (TravelPackage p : list) {
            area.append(p.getId() + ". " + p.getName() + " - Rs." + p.getPrice() + "\n" + p.getDescription() + "\n\n");
        }

        add(new JScrollPane(area));
        setVisible(true);
    }
}
