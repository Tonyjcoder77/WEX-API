package com.api.wex.Controller;

import com.api.wex.Services.FiscalDataService;
import com.api.wex.model.RatesRecord;
import com.api.wex.model.rates.DataRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Rates")
public class ExchangeRatesController {
    @Autowired
    FiscalDataService fiscalDataService;

    @GetMapping("/{datefrom}")
    public ResponseEntity<RatesRecord> convert(@PathVariable String datefrom)  {
        DataRecord countryRates = fiscalDataService.getExchangeRates(datefrom);
        return ResponseEntity.ok(new RatesRecord(countryRates.getData()));
    }
}
