package com.carrental.controllers;

import com.carrental.models.Invoice;
import com.carrental.services.InvoiceService;

public class InvoiceController {
    private InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void addInvoice(Invoice invoice) {
        invoiceService.saveInvoice(invoice);
    }

    public void updateInvoice(int invoiceId, Invoice invoice) {
        invoiceService.updateInvoice(invoiceId, invoice);
    }

    public Invoice getInvoice(int invoiceId) {
        return invoiceService.findInvoiceById(invoiceId);
    }

    public void deleteInvoice(int invoiceId) {
        invoiceService.deleteInvoice(invoiceId);
    }
}
