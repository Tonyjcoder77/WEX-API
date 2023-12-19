package com.api.wex.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idPurchase;
    public String description;
    public LocalDate transactionDate;
    public Double purchaseAmount;

    public Purchase(){};
    public Purchase(String description, LocalDate transactionDate, Double purchaseAmount) {
        this.description = description;
        this.transactionDate = transactionDate;
        this.purchaseAmount = purchaseAmount;
    }

    public void setIdPurchase(Long idPurchase) {
        this.idPurchase = idPurchase;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public Long getIdPurchase() {
        return idPurchase;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return idPurchase.equals(purchase.idPurchase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPurchase);
    }
}
