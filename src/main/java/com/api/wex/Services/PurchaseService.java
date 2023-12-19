package com.api.wex.Services;

import com.api.wex.Repository.PurchaseRepository;
import com.api.wex.model.*;
import com.api.wex.model.rates.CountryRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class PurchaseService {

    @Autowired
    PurchaseRepository purchaseRepository;

    @Value("${url.rates}")
    private String urlRates;
    public List<ConvertedPurchase> convert(String datefrom) {

        RatesRecord countriesRates = getRates(datefrom);

        List<Purchase> purchases = purchaseRepository.findAll();

        return rateValidation(countriesRates, purchases);
    }

    private RatesRecord getRates(String datefrom) {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        RatesRecord ratesRecord = restTemplate.getForObject(urlRates+"/"+datefrom, RatesRecord.class);
        return ratesRecord;
    }

    private List<ConvertedPurchase> rateValidation(RatesRecord countriesRates, List<Purchase> purchases) {
        List<ConvertedPurchase> convertedPurchases = new ArrayList<>();
        Double exchangeRate = 0.0; Double convertedAmount = 0.0; String convertStatus = "";
        LocalDate taxDate = null;LocalDate period = null; String description = "";
        for(Purchase prch: purchases){
            for(CountryRate countryRate: countriesRates.getRates()){
                exchangeRate = Double.valueOf(countryRate.getExchange_rate());
                taxDate = LocalDate.parse(countryRate.getRecord_date());
                description = countryRate.getCountry_currency_desc();

                convertStatus = "Expired Exchange Rate, conversion error!";
                convertedAmount = 0.0;

                if((taxDate.isEqual(prch.getTransactionDate())) ||
                  ((taxDate.isBefore(prch.getTransactionDate()))&
                        (taxDate.plusMonths(6).isAfter(prch.getTransactionDate())))){
                    convertStatus = "Conversion Successful!";
                    convertedAmount = exchangeRate * prch.getPurchaseAmount();
                }
                ConvertedPurchase cnvPrch = new ConvertedPurchase(prch, exchangeRate, convertedAmount,
                                                                 description, convertStatus);
                convertedPurchases.add(cnvPrch);
            }
        }
        return convertedPurchases;
    }

    public void create(Purchase purchase) {
        purchaseRepository.save(purchase);
    }
}
