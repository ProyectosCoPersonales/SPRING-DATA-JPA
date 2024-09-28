package com.DB2.Model.entity;

import java.math.BigDecimal;

public class MedicationInventory {
    private Long medicationInventoryId;
    private Medication medication;
    private Integer availableQuantity;
    private Supplier supplier;
    private BigDecimal purchasePrice;
    private BigDecimal salePrice;
}
