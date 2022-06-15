package com.amiranga.springremote;

import java.io.Serializable;

import static java.lang.String.format;

public class Booking implements Serializable {
    private String bookingCode;

    public Booking() {
    }

    public Booking(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    @Override
    public String toString() {
        return format("Ride confirmed: code '%s'.", bookingCode);
    }
}
