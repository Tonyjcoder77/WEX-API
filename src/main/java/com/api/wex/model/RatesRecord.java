package com.api.wex.model;

import com.api.wex.model.rates.CountryRate;

import java.util.List;

public class RatesRecord {
     List<CountryRate> countryRateList;

     public RatesRecord() {
     }

     public RatesRecord(List<CountryRate> countryRateList) {
          this.countryRateList = countryRateList;
     }

     public List<CountryRate> getRates() {
          return countryRateList;
     }

     public void setRates(List<CountryRate> countryRateList) {
          this.countryRateList = countryRateList;
     }

}
