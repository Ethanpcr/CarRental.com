package com.carrental.models;

import java.math.BigDecimal;

public class Invoice {
    private int id;
    private int bookingId;
    private BigDecimal amount;

    public Invoice(int id, int bookingId, BigDecimal amount) {
        this.id = id;
        this.bookingId = bookingId;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
