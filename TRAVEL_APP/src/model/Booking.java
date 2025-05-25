package model;

import java.util.Date;

public class Booking {
    private int id, userId, packageId;
    private Date bookingDate;

    public Booking(int id, int userId, int packageId, Date bookingDate) {
        this.id = id; this.userId = userId; this.packageId = packageId; this.bookingDate = bookingDate;
    }

    // Getters and setters...
}
