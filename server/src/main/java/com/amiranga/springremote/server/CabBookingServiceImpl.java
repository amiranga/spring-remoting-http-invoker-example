package com.amiranga.springremote.server;

import com.amiranga.springremote.Booking;
import com.amiranga.springremote.BookingException;
import com.amiranga.springremote.CabBookingService;

import static java.lang.Math.random;
import static java.util.UUID.randomUUID;

public class CabBookingServiceImpl implements CabBookingService {

    @Override
    public Booking bookRide(String pickUpLocation) throws BookingException {
        if (random() < 0.3) throw new BookingException("Cab unavailable");
        return new Booking(randomUUID().toString());
    }
}
