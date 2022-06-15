package com.amiranga.springremote;

public interface CabBookingService {
    Booking bookRide(String pickUpLocation) throws BookingException;
}
