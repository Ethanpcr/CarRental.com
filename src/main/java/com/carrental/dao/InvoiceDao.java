package com.carrental.dao;

import com.carrental.models.Invoice;
import java.util.List;

public interface InvoiceDao {
    Invoice findById(int id);
    List<Invoice> findAll();
    void save(Invoice invoice);
    void update(Invoice invoice);
    void delete(int invoiceId);
}
