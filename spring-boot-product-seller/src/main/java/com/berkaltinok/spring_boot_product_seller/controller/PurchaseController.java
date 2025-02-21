package com.berkaltinok.spring_boot_product_seller.controller;

import com.berkaltinok.spring_boot_product_seller.model.Purchase;
import com.berkaltinok.spring_boot_product_seller.security.UserPrinciple;
import com.berkaltinok.spring_boot_product_seller.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")//pre-path
public class PurchaseController
{
    @Autowired
   private PurchaseService purchaseService;

    @PostMapping//api/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase)
    {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrinciple userPrinciple)
    {
        return ResponseEntity.ok(purchaseService.findPurchaseItemOfUser(userPrinciple.getId()));
    }
}
