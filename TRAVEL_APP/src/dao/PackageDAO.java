package dao;

import model.TravelPackage;
import util.DatabaseConnection;

import java.sql.*;
import java.util.*;

public class PackageDAO {
    public List<TravelPackage> getAllPackages() {
        List<TravelPackage> list = new ArrayList<>();
        String sql = "SELECT * FROM packages";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                list.add(new TravelPackage(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getString("description")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
