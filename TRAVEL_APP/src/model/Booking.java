package model;

import java.util.Date;

public class Booking {
    private int id;
    private int userId;
    private int packageId;
    private String bookingDate;

    // Constructor
    public Booking(int id, int userId, int packageId, String bookingDate) {
        this.id = id;
        this.userId = userId;
        this.packageId = packageId;
        this.bookingDate = bookingDate;
    }

    public Booking(int id2, int userId2, int packageId2, Date date) {
        //TODO Auto-generated constructor stub
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

    public String getBookingDate() {
        return bookingDate;
    }
}