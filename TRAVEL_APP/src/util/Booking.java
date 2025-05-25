package util;

import java.util.Date;


public class Booking {
    private int id;
    private int userId;
    private int packageId;
    private Date bookingDate; // Changed from String to Date

    // Constructor
    public Booking(int id, int userId, int packageId, Date bookingDate) {
        this.id = id;
        this.userId = userId;
        this.packageId = packageId;
        this.bookingDate = bookingDate;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getPackageId() {
        return packageId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }
}