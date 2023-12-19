package com.api.wex.Controller;

import com.api.wex.Services.PurchaseService;
import com.api.wex.model.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Convert")
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;

    @GetMapping("/{datefrom}")
    public ResponseEntity<List<ConvertedPurchase>> retrievePurchase(@PathVariable String datefrom) {

            List<ConvertedPurchase> purchases = purchaseService.convert(datefrom);

        return ResponseEntity.ok(purchases);
    }

    @PostMapping("/AddPurchase")
    @Transactional
    public ResponseEntity<?> create(@RequestBody @Valid PurchaseForm form) {
        Purchase purchase = form.converter();
        purchaseService.create(purchase);

        return ResponseEntity.ok().build();
    }

}
