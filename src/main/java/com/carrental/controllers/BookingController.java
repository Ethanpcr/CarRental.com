package com.carrental.controllers;

import com.carrental.models.Booking;
import com.carrental.services.BookingService;

public class BookingController {
    private BookingService.BookingService bookingService;

    public BookingController(BookingService.BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public void addBooking(Booking booking) {
        bookingService.saveBooking(booking);
    }

    public void updateBooking(int bookingId, Booking booking) {
        bookingService.updateBooking(bookingId, booking);
    }

    public Booking getBooking(int bookingId) {
        return bookingService.findBookingById(bookingId);
    }

    public void deleteBooking(int bookingId) {
        bookingService.deleteBooking(bookingId);
    }
}
