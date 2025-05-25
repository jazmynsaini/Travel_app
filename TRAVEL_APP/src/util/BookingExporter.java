package util;

import dao.BookingDAO;
import model.Booking;
import java.io.FileWriter;
import java.util.List;

public class BookingExporter {
    public static void exportBookingsToFile(String filename) {
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write("ID,UserID,PackageID,Date\n");
            for (Booking b : new BookingDAO().getAllBookings()) {
                fw.write(b.getId() + "," + b.getUserId() + "," + b.getPackageId() + "," + b.getBookingDate() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
