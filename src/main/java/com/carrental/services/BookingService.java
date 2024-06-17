package com.carrental.services;

import com.carrental.dao.BookingDao;
import com.carrental.models.Booking;

import java.util.List;

public class BookingService {
    public static class BookingService {
        private BookingDao bookingDao;

        public BookingService(BookingDao bookingDao) {
            this.bookingDao = bookingDao;
        }

        public Booking findBookingById(int id) {
            return bookingDao.findById(id);
        }

        public List<Booking> findAllBookings() {
            return bookingDao.findAll();
        }

        public void saveBooking(Booking booking) {
            bookingDao.save(booking);
        }

        public void updateBooking(Booking booking) {
            bookingDao.update(booking);
        }

        public void deleteBooking(int id) {
            bookingDao.delete(id);
        }
    }
}
