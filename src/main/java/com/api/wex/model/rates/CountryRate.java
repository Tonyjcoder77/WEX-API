package com.api.wex.model.rates;

public class CountryRate {

     String country_currency_desc;
     String exchange_rate;
     String record_date;

    public CountryRate(String country_currency_desc, String exchange_rate, String record_date) {
        this.country_currency_desc = country_currency_desc;
        this.exchange_rate = exchange_rate;
        this.record_date = record_date;
    }

    public String getCountry_currency_desc() {
        return country_currency_desc;
    }

    public String getExchange_rate() {
        return exchange_rate;
    }

    public String getRecord_date() {
        return record_date;
    }

    public void setCountry_currency_desc(String country_currency_desc) {
        this.country_currency_desc = country_currency_desc;
    }

    public void setExchange_rate(String exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    public void setRecord_date(String record_date) {
        this.record_date = record_date;
    }
}
