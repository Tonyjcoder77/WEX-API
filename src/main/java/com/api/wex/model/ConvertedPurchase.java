package com.api.wex.model;

import java.time.LocalDate;

public record ConvertedPurchase ( Long idPurchase, String description, LocalDate transactionDate,
                                  Double purchaseAmount, Double exchangeRate, Double convertedAmount,
                                  String countryCurrencyDesc, String convertStatus){

    public ConvertedPurchase(Purchase purchase, Double exchangeRate, Double convertedAmount,
                             String countryCurrencyDesc, String convertStatus) {
        this(purchase.idPurchase, purchase.description, purchase.transactionDate,
             purchase.purchaseAmount, exchangeRate, convertedAmount, countryCurrencyDesc, convertStatus);
    }

}
