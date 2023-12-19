package com.api.wex.model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class PurchaseForm {
    @NotNull @NotEmpty
    public String description;
    @NotNull @NotEmpty
    public LocalDate transactionDate;
    @NotNull @NotEmpty
    public Double purchaseAmount;

    public Purchase converter() {
        Purchase purchase = new Purchase();
        purchase.setDescription(this.description);
        purchase.setTransactionDate(this.transactionDate);
        purchase.setPurchaseAmount(this.purchaseAmount);
        return purchase;
    }
}
