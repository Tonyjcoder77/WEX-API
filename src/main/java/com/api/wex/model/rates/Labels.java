package com.api.wex.model.rates;

public class Labels {

    public String country_currency_desc;
    public String exchange_rate;
    public String record_date;

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

    //     "country_currency_desc": "Country - Currency Description",
//                "exchange_rate": "Exchange Rate",
//                "record_date": "Record Date"

}
