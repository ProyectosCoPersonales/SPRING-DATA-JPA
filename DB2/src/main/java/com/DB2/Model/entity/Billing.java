package com.DB2.Model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Billing {
    private Long billingId;
    private Patient patient;
    private LocalDate dateOfIssue;
    private List<Medication> medications;
    private BigDecimal totalAmount;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;

    public enum PaymentMethod {
        CREDIT_CARD, DEBIT_CARD, CASH, PAYPAL
    }

    public enum PaymentStatus {
        PENDING, PAID, CANCELED
    }
}
