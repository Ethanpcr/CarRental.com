package com.carrental.services;

import com.carrental.models.Invoice;
import com.carrental.dao.InvoiceDao;

import java.util.List;

public class InvoiceService {
    private InvoiceDao invoiceDao;

    public InvoiceService(InvoiceDao invoiceDao) {
        this.invoiceDao = invoiceDao;
    }

    public Invoice findInvoiceById(int id) {
        return invoiceDao.findById(id);
    }

    public List<Invoice> findAllInvoices() {
        return invoiceDao.findAll();
    }

    public void saveInvoice(Invoice invoice) {
        invoiceDao.save(invoice);
    }

    public void updateInvoice(Invoice invoice) {
        invoiceDao.update(invoice);
    }

    public void deleteInvoice(int id) {
        invoiceDao.delete(id);
    }
}
