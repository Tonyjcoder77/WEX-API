package com.api.wex.Services;

import com.api.wex.model.rates.DataRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class FiscalDataService {

    @Value("${url.ext.api}")
    private String urlExtApi;

    public DataRecord getExchangeRates(String datefrom) {
        String uri = urlExtApi+datefrom;
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        DataRecord cr = restTemplate.getForObject(uri, DataRecord.class);
        return cr;
    }
}
