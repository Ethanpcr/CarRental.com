package com.carrental.dao;

import com.carrental.models.Booking;
import java.util.List;

public interface BookingDao {
    Booking findById(int id);
    List<Booking> findAll();
    void save(Booking booking);
    void update(Booking booking);
    void delete(int bookingId);
}
